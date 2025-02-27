package Genericos;

public class Utils {
    public static <T extends Number> T max (T a, T b) {
        return a.doubleValue() > b.doubleValue() ? a : b;
    }

    public static void sorter(Lista<? super Mesero> lista) {  //Ejemplo de Wildcards
        //Mesero m1 = lista.get(0);
        lista.add(new Mesero(3));
    }
}
