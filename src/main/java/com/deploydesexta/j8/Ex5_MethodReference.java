package com.deploydesexta.j8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex5_MethodReference {

    class User {
        String name;
        int age;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        /**
         * Antes
         */
        final Comparator<Long> ageComparator = new Comparator<Long>() {
            @Override
            public int compare(final Long age1, final Long age2) {
                return age1.compareTo(age2);
            }
        };

        /**
         * Depois
         */
        final Comparator<Long> ageLambdaComparator = (age1, age2) -> age1.compareTo(age2);

        final Comparator<Long> ageReferenceComparator = Long::compareTo;

        /**
         * Refatorando o exemplo do StreamsAPI com lambdas
         */
        final List<User> users = getUsers();

        final List<String> underAged2 = users.stream()
                .filter(user -> user.getAge() < 18)
                .map(User::getName)
                .collect(Collectors.toList());
    }

    private static List<User> getUsers() {
        return Collections.emptyList();
    }
}
