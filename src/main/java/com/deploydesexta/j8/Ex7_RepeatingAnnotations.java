package com.deploydesexta.j8;

import java.lang.annotation.Repeatable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * https://openjdk.java.net/jeps/120
 */
public class Ex7_RepeatingAnnotations {

    @Repeatable(Monitoring.class)
    public @interface Alert {
        String to();
    }

    public @interface Monitoring {
        Alert[] value();
    }

    @Alert(to = "user")
    @Alert(to = "admin")
    public String processUser() {
        return "";
    }

    public static void main(String[] args) throws Exception {

        final Method method = Ex7_RepeatingAnnotations.class
                .getDeclaredMethod("processUser");

        final Alert[] security = method.getAnnotationsByType(Alert.class);

        Arrays.stream(security)
                .forEach(System.out::println);
    }
}
