package Streams;

import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void run() {
        List<User> users = List.of(
                new User(14, "abc@x.com"),
                new User(10, "bcd@x.com"),
                new User(22, "fgh@x.com")
        );

        users.stream()
                .sorted(Comparator.comparing(a -> a.email))
                .forEach(x -> System.out.println(x.email));
//                .sorted(Comparator.comparing(a -> a.email));
    }
}
