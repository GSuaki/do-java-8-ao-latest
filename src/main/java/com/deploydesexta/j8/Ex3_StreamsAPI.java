package com.deploydesexta.j8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex3_StreamsAPI {

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
        final List<User> users = getUsers();

        /**
         * Antes
         */
        final List<String> underAged = new ArrayList<>();
        for (final User u : users) {
            if (u.getAge() < 18) {
                underAged.add(u.getName());
            }
        }
        System.out.println(underAged);


        /**
         * Depois
         */
        final List<String> underAged2 = users.stream()
                .filter(new Predicate<User>() {
                    @Override
                    public boolean test(final User user) {
                        return user.getAge() < 18;
                    }
                })
                .map(new Function<User, String>() {
                    @Override
                    public String apply(User user) {
                        return user.getName();
                    }
                })
                .collect(Collectors.toList());
        System.out.println(underAged2);
    }

    private static List<User> getUsers() {
        return Collections.emptyList();
    }
}
