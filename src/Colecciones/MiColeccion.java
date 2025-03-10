package Colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MiColeccion {
    public static void run() {
        Collection<Number> coleccion = new ArrayList<>();
        coleccion.add(1);
        coleccion.add(2);
        Collections.addAll(coleccion, 3, 4, 5, 6);
        coleccion.remove(3);
        System.out.println("Existe: " + coleccion.contains(3));
        System.out.println(coleccion);

        Number[] x = coleccion.toArray(new Number[5]);

        System.out.println(coleccion.isEmpty());
        //coleccion.clear();
        System.out.println("Despues de llamar a clear: " + coleccion);

        Collection<Number> otra = new ArrayList<>();
        otra.add(7);
        otra.add(8);

        System.out.println(coleccion.equals(otra));

        coleccion.addAll(otra);

        System.out.println(coleccion);

        for (var elemento: coleccion) {
            System.out.println("elemento = " + elemento);
        }
    }
}
