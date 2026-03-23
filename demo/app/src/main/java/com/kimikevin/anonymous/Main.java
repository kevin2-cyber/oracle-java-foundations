package com.kimikevin.anonymous;

public class Main {
    private static String BYE_STRING = "Auf Wiedersehen!";

    public static void main(String[] args) {
        final String hello = "Guten Tag!";
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

        SpeakingEntity germanSpeakingPerson = new SpeakingEntity() {
            @Override
            public void sayHello() {
                System.out.println(hello);
            }

            @Override
            public void sayBye() {
                System.out.println(BYE_STRING);
            }
        };

        germanSpeakingPerson.sayHello();
        germanSpeakingPerson.sayBye();
    }

    interface SpeakingEntity {
        void sayHello();
        void sayBye();
    }
}
