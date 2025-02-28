package Streams;

import java.util.List;
import java.util.stream.Collectors;

public class Collector {
    public static void run() {
        List<User> users = List.of(
                new User(14, "abc@x.com"),
                new User(10, "bcd@x.com"),
                new User(22, "fgh@x.com")
        );

        var resultado = users.stream()
//                .map(x -> x.age)
                .collect(Collectors.toMap(x -> x.email, x -> x));

        System.out.println("resultado = " + resultado);
    }

    public static void particionado() {
        List<User> users = List.of(
                new User(14, "abc@x.com"),
                new User(10, "bcd@x.com"),
                new User(22, "fgh@x.com")
        );

        var particion = users.stream()
                .collect(Collectors.partitioningBy(x -> x.age > 17));

        System.out.println("particion = " + particion.get(false));
    }

    public static void grouping() {
        List<User> users = List.of(
                new User(14, "abc@x.com", Mandos.MEDIO),
                new User(10, "bcd@x.com", Mandos.MEDIO),
                new User(22, "fgh@x.com", Mandos.ALTO)
        );

        var grouped = users.stream()
                .collect(Collectors.groupingBy(x -> x.mando));

        System.out.println("grouped = " + grouped);
    }
}
