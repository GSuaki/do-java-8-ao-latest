package com.deploydesexta.j8;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Ex1_DefaultMethods {

    interface Vehicle {
        LocalDateTime createdAt();

        default ZonedDateTime getLocalCreatedAt(final String tzId) {
            return createdAt().atZone(ZoneId.of(tzId));
        }
    }

    class Car implements Vehicle {

        private final LocalDateTime createdAt = LocalDateTime.now();

        @Override
        public LocalDateTime createdAt() {
            return createdAt;
        }
    }

    class Bike implements Vehicle {

        private final LocalDateTime createdAt = LocalDateTime.now();

        @Override
        public LocalDateTime createdAt() {
            return createdAt;
        }
    }
}
