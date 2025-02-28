package Streams;

import java.util.List;

public class Reducers {
    public static void run() {
        List<User> users = List.of(
                new User(14, "abc@x.com"),
                new User(14, "abc@x.com"),
                new User(10, "bcd@x.com"),
                new User(22, "fgh@x.com")
        );

        var xs = users.stream()
                .map(x -> x.email)
//                .allMatch(x -> x.length() > 3);
//                .findFirst();
//                .findAny();
//                .min((a, b) -> a.compareTo(b));
                .max((a, b) -> a.compareTo(b));
        System.out.println(xs.get());

    }

    public static void comun() {
        List<User> users = List.of(
                new User(14, "abc@x.com"),
                new User(14, "abc@x.com"),
                new User(10, "bcd@x.com"),
                new User(22, "fgh@x.com")
        );

//        var emails = users.stream()
//                .limit(2)
//                .map(x -> x.email)
//                .reduce((acc, el) -> acc + ", " + el);
//
//        var valor = emails.orElse("No hay correos...");

        var ages = users.stream()
                .map(x -> x.age)
                .reduce(0, (acc, el) -> acc + el);

        System.out.println(ages / users.stream().count());
    }
}
