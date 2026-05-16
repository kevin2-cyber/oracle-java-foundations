package com.kimikevin.elapunte.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Entity
@Table(name = "notes")
public class Note {
    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private String id;
    @Column(name = "title", nullable = false, length = 255)
    private String title;
    @Column(name = "content", columnDefinition = "TEXT")
    private String content;
    @Column(name = "formatted_date", nullable = false)
    private String formattedDate;

    @Version
    @Column(name = "version")
    private Long version;

    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = Instant.now();
        updatedAt = Instant.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = Instant.now();
    }
}
