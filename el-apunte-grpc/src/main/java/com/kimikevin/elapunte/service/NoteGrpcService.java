package com.kimikevin.elapunte.service;

import com.google.protobuf.Empty;
import com.kimikevin.elapunte.model.Note;
import com.kimikevin.elapunte.proto.*;
import com.kimikevin.elapunte.repository.NoteRepository;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.grpc.server.service.GrpcService;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;

@GrpcService
public class NoteGrpcService extends NoteServiceGrpc.NoteServiceImplBase {
    private static final Logger log = LoggerFactory.getLogger(NoteGrpcService.class);

    private final NoteRepository noteRepository;

    public NoteGrpcService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    @Transactional
    public void createNote(CreateNoteRequest request, StreamObserver<NoteResponse> responseObserver) {
        try {
            if (request.getId().isBlank()) {
                responseObserver.onError(Status.INVALID_ARGUMENT
                        .withDescription("Note ID must not be blank")
                        .asRuntimeException());
                return;
            }
            if (request.getTitle().isBlank() && request.getContent().isBlank()) {
                responseObserver.onError(Status.INVALID_ARGUMENT
                        .withDescription("Note must have a title or content")
                        .asRuntimeException());
                return;
            }

            if (noteRepository.existsById(request.getId())) {
                responseObserver.onError(Status.ALREADY_EXISTS
                        .withDescription("Note with id " + request.getId() + " already exists")
                        .asRuntimeException());
                return;
            }

            String formattedDate = request.getFormattedDate().isBlank()
                    ? Instant.now().toString()
                    : request.getFormattedDate();

            Note note = Note.builder()
                    .id(request.getId())
                    .title(request.getTitle())
                    .content(request.getContent())
                    .formattedDate(formattedDate)
                    .build();

            Note savedNote = noteRepository.save(note);
            log.info("Created note id={}", savedNote.getId());

            responseObserver.onNext(toProto(savedNote));
            responseObserver.onCompleted();

        } catch (Exception e) {
            log.error("createNote failed for id={}: {}", request.getId(), e.getMessage(), e);
            responseObserver.onError(Status.INTERNAL
                    .withDescription("Internal error creating note")
                    .withCause(e)
                    .asRuntimeException());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public void getNote(NoteIdRequest request, StreamObserver<NoteResponse> responseObserver) {
        try {
            if (request.getId().isBlank()) {
                responseObserver.onError(Status.INVALID_ARGUMENT
                        .withDescription("Note ID must not be blank")
                        .asRuntimeException());
                return;
            }

            Note note = noteRepository.findById(request.getId()).orElse(null);

            if (note == null) {
                responseObserver.onError(Status.NOT_FOUND
                        .withDescription("Note not found: " + request.getId())
                        .asRuntimeException());
                return;
            }

            log.info("Fetched note id={}", request.getId());

            responseObserver.onNext(toProto(note));
            responseObserver.onCompleted();

        } catch (Exception e) {
            log.error("getNote failed for id={}: {}", request.getId(), e.getMessage(), e);
            responseObserver.onError(Status.INTERNAL
                    .withDescription("Internal error fetching note")
                    .withCause(e)
                    .asRuntimeException());
        }
    }

    @Override
    @Transactional(readOnly = true)
    public void getAllNotes(GetAllNotesRequest request, StreamObserver<NoteListResponse> responseObserver) {
        try {
            int page = request.getPage() <= 0 ? 0 : request.getPage();
            int size = request.getSize() <= 0 || request.getSize() > 100 ? 20 : request.getSize();

            // Sort by createdAt once Note entity is updated with proper timestamp field
            // For now sorting by formattedDate as the closest available chronological field
            Pageable pageable = PageRequest.of(page, size, Sort.by("formattedDate").descending());
            Page<Note> notePage = noteRepository.findAll(pageable);

            NoteListResponse.Builder builder = NoteListResponse.newBuilder();
            for (Note note : notePage.getContent()) {
                builder.addNotes(toProto(note));
            }

            log.info("Fetched {} notes page={} size={}", notePage.getNumberOfElements(), page, size);

            responseObserver.onNext(builder.build());
            responseObserver.onCompleted();

        } catch (Exception e) {
            log.error("getAllNotes failed: {}", e.getMessage(), e);
            responseObserver.onError(Status.INTERNAL
                    .withDescription("Internal error fetching notes")
                    .asRuntimeException());
        }
    }

    @Override
    @Transactional
    public void updateNote(UpdateNoteRequest request, StreamObserver<NoteResponse> responseObserver) {
        try {
            if (request.getId().isBlank()) {
                responseObserver.onError(Status.INVALID_ARGUMENT
                        .withDescription("Note ID must not be blank")
                        .asRuntimeException());
                return;
            }

            Note existingNote = noteRepository.findById(request.getId()).orElse(null);

            if (existingNote == null) {
                responseObserver.onError(Status.NOT_FOUND
                        .withDescription("Note not found: " + request.getId())
                        .asRuntimeException());
                return;
            }

            // Managed entity — dirty checking handles persistence at transaction commit
            // No explicit save() needed
            existingNote.setTitle(request.getTitle());
            existingNote.setContent(request.getContent());
            existingNote.setFormattedDate(Instant.now().toString());

            log.info("Updated note id={}", existingNote.getId());

            responseObserver.onNext(toProto(existingNote));
            responseObserver.onCompleted();

        } catch (Exception e) {
            log.error("updateNote failed for id={}: {}", request.getId(), e.getMessage(), e);
            responseObserver.onError(Status.INTERNAL
                    .withDescription("Internal error updating note")
                    .withCause(e)
                    .asRuntimeException());
        }
    }

    @Override
    @Transactional
    public void deleteNote(NoteIdRequest request, StreamObserver<Empty> responseObserver) {
        try {
            if (request.getId().isBlank()) {
                responseObserver.onError(Status.INVALID_ARGUMENT
                        .withDescription("Note ID must not be blank")
                        .asRuntimeException());
                return;
            }

            if (!noteRepository.existsById(request.getId())) {
                responseObserver.onError(Status.NOT_FOUND
                        .withDescription("Note not found: " + request.getId())
                        .asRuntimeException());
                return;
            }

            noteRepository.deleteById(request.getId());
            log.info("Deleted note id={}", request.getId());

            responseObserver.onNext(Empty.newBuilder().build());
            responseObserver.onCompleted();

        } catch (Exception e) {
            log.error("deleteNote failed for id={}: {}", request.getId(), e.getMessage(), e);
            responseObserver.onError(Status.INTERNAL
                    .withDescription("Internal error deleting note")
                    .withCause(e)
                    .asRuntimeException());
        }
    }

    // ── Private mapper ───────────────────────────────────────────────────────

    private NoteResponse toProto(Note note) {
        return NoteResponse.newBuilder()
                .setId(note.getId() != null ? note.getId() : "")
                .setTitle(note.getTitle() != null ? note.getTitle() : "")
                .setContent(note.getContent() != null ? note.getContent() : "")
                .setFormattedDate(note.getFormattedDate() != null ? note.getFormattedDate() : "")
                .build();
    }
}