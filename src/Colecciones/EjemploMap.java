package Colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EjemploMap {
    public static void run() {
        List<User> users = new ArrayList<>();


    }

    public static void map() {
        User u1 = new User("Jose", "abc@gmail.com");
        User u2 = new User("Pedro", "def@gmail.com");

        Map<String, User> users = new HashMap<>();

        users.put(u1.getEmail(), u1);
        users.put(u2.getEmail(), u2);
        User anon = new User("Anonymous", "");

        System.out.println(users.get(u1.getEmail()));
        System.out.println(users.getOrDefault("Luis", anon));
        System.out.println(users.containsKey("abc@gmail.com"));

        users.replace("abc@gmail.com", new User("Luis", "abc@gmail.com"));
        System.out.println(users.get("abc@gmail.com"));

        for(var user: users.values()) {
            System.out.println(user);
        }
    }
}
