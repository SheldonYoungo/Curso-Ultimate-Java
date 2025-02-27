package Ejercicios;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("salir")){
            System.out.println("Ingresa un comando: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

        System.out.println("Terminó el loop");
    }
}


