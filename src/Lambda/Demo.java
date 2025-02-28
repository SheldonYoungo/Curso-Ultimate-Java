package Lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.function.*;

public class Demo {
    private static String text = "Imprimiendo en lambda: ";
    private static Notificable lambda = message -> {
        System.out.println(text + message);
    };

    public Demo(String message) {}

    public static void metodo(String message) {

    }

    public void metodoInstancia(String message) {

    }

    public static void run() {
        push(lambda);
        push(message -> metodo(message));
        push(Demo::metodo);
        push(System.out::println);
        Demo demo = new Demo("hello world");
        push(demo::metodoInstancia);
        push(Demo::new);
    }

    public static void incluidas() {
        List<String> l = List.of("hola", "Mundo");

//        l.forEach(Demo::sendPush);

        Consumer<String> notify = el -> System.out.println("Enviando a " + el);
        Consumer<String> store = el -> System.out.println("Guardando: " + el);

        l.forEach(notify.andThen(store));

        Supplier<LocalDate> ahora = LocalDate::now;

        System.out.println(ahora.get());

        Function<Integer, Double> mitad = x -> x / 2.0;
        Function<Double, Double> aumenta = x -> x + 2;

        var y = mitad
                .andThen(aumenta)
                .andThen(x -> x * 5 )
                .apply(25);

        System.out.println(y);

        y = mitad
                .compose((Integer x) -> x + 2)
                .compose((Integer x) -> x * 5)
                .apply(25);

        System.out.println(y);

        Predicate<String> masDeTres = x -> x.length() > 3;

        var result = masDeTres.test("helloworld");
        System.out.println(result);

        List<String> lista = new ArrayList<>();
        Collections.addAll(lista, "Felipe", "Hose", "hw");
        var filtrado = lista.stream().filter(masDeTres);
        System.out.println("filtrado = " + filtrado.toList());
    }

    public static void combinacion() {
        Predicate<String> tieneAt = s -> s.contains("@");
        Predicate<String> minSeis = s -> s.length() > 5;
        Predicate<String> dominioTienePunto = s -> {
            var at = s.indexOf("@");

            if (at == -1) return false;

            var dominio = s.substring(at);
            System.out.println(dominio);
            return dominio.indexOf(".") > 1 && dominio.length() > 4;
        };

        var nuevoPredicate = tieneAt.and(minSeis).and(dominioTienePunto);

        System.out.println(nuevoPredicate.test("helloworld@x.com"));
    }

    public static void unaryAndBinary() {
        Function<Integer, Integer> inc = a -> a + 2;
        UnaryOperator<Integer> inc2 = a -> a + 2;

        BinaryOperator<Integer> pow = (a, b) -> (int) Math.pow(a, b);

        System.out.println(inc.apply(23));
        System.out.println(inc2.apply(50));
        System.out.println(pow.apply(2, 3));
    }

    public static void push(Notificable n) {
        n.push("Hello world");
    }

    public static void sendPush(String id) {
        System.out.println("Enviando notificacion push: " + id);
    }
}
