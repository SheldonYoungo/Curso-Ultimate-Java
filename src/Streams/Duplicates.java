package Streams;

import java.util.List;

public class Duplicates {
    public static void run() {
        List<User> users = List.of(
                new User(14, "abc@x.com"),
                new User(14, "abc@x.com"),
                new User(10, "bcd@x.com"),
                new User(22, "fgh@x.com")
        );

        users.stream()
                .map(x -> x.email)
                .peek(System.out::println)
                .distinct()
                .peek(System.out::println)
                .forEach(System.out::println);
    }
}
