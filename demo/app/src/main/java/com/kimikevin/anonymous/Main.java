package com.kimikevin.anonymous;

public class Main {
    public static void main(String[] args) {
        SpeakingEntity englishSpeakingPerson = new SpeakingEntity() {
            @Override
            public void sayHello() {
                System.out.println("Hello!");
            }

            @Override
            public void sayBye() {
                System.out.println("Bye!");
            }
        };

        englishSpeakingPerson.sayHello();
        englishSpeakingPerson.sayBye();

        SpeakingEntity cat = new SpeakingEntity() {
            @Override
            public void sayHello() {
                System.out.println("Meow!");
            }

            @Override
            public void sayBye() {
                System.out.println("Meow!");
            }
        };

        cat.sayHello();
        cat.sayBye();
    }

    interface SpeakingEntity {
        void sayHello();
        void sayBye();
    }
}
