package Colecciones;

import java.util.ArrayDeque;
import java.util.Deque;

public class DemoDeque{
    public static void run() {
        Deque<String> q = new ArrayDeque<>();
        q.addFirst("Goku");
        q.addFirst("Vegueta");
        q.addLast("Freezer");
        q.addLast("Cell");

        System.out.println(q.pollFirst());
        System.out.println(q.pollLast());
        System.out.println(q);
    }
}
