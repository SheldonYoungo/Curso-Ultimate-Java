package Genericos;

/**
 * Archivo Excepciones.Main para explicar los genéricos. Colocar fuera del paquete para poder probarlo
 */
public class Main {
    public static void main(String[] args) {
        Mesero m1 = new Mesero(1);
        Mesero m2 = new Mesero(2);

        if(m1.compareTo(m2) < 0) {
            System.out.println(m1.compareTo(m2));
            System.out.println("m2 es mayor");
        }

        var r = Utils.max(2.0, 1.15);
        System.out.println("r = " + r);
//        Lista<Mesero> lista = new Lista<>();
//
//        lista
//            .add(new Mesero(1))
//            .add(new Mesero(2));
//
//        Mesero elem =  lista.get(0);
//
//        Pairs<Integer, String> p = new Pairs<>(1, "Hello world");
//        var key = p.getKey();
//        var value = p.getValue();
    }
}
