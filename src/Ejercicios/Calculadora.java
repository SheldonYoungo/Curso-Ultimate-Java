package Ejercicios;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        /**
         * Crear una calculadora que reciba
         * 2 números e luego imprima el resultado de la
         * suma de estos dos números
          */
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA DE LA GOD BROTHER");
        System.out.println("Ingresa el primer número:");

        double a = scanner.nextDouble();

        System.out.println("Ingresa el segundo número:");
        double b = scanner.nextDouble();

        System.out.println("El valor de la suma es:");
        System.out.println(a + b);
    }
}
