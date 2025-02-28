package Streams;

import java.util.List;
import java.util.stream.Stream;

public class DemoMap {
    public static void run() {
        List<User> users = List.of(
                new User(14, "abc@x.com"),
                new User(10, "bcd@x.com"),
                new User(22, "fgh@x.com")
        );

        users.stream()
                .map(user -> user.email)
                .map(email -> email + " activo")
                .forEach(email -> System.out.println(email));
    }

    public static void flatMap() {
        var stream = Stream.of(
                List.of(1,2,3),
                List.of(4,5,6)
        );

        stream.flatMap(l -> l.stream())
                .forEach(i -> System.out.println(i));
    }
}
