package Colecciones;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class EjemploSet {
    public static void run() {
        Set<String> conjunto = new HashSet<>(Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes"));

        conjunto.add("Sabado");
        conjunto.add("Lunes");
        conjunto.remove("Sabado");

        System.out.println(conjunto);

//        Collections.addAll(conjunto, "Sabado", "Domingo");
//        System.out.println(conjunto);

        Set<String> conjunto2 = new HashSet<>(Arrays.asList("Viernes", "Sabado", "Domingo"));

        //Union
//        conjunto.addAll(conjunto2);
//        System.out.println(conjunto);

        //Diferencia
//        conjunto.removeAll(conjunto2);
//        System.out.println(conjunto);

        //Intersección
//        conjunto.retainAll(conjunto2);
//        System.out.println(conjunto);
    }
}
