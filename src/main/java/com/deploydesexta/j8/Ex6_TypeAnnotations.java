package com.deploydesexta.j8;

import java.util.function.Predicate;

/**
 * https://openjdk.java.net/jeps/104
 *
 * https://docs.oracle.com/javase/tutorial/java/annotations/type_annotations.html
 */
public class Ex6_TypeAnnotations {

    static class User {

        public User(@NonNull String name) {

        }

        /**
         * Annotation processor gera:
         */
//        public User(@NonNull String name) {
//             if (name == null) {
//                 throw new IllegalArgumentException();
//             }
//        }
    }

    public @interface NonNull {
    }
}
