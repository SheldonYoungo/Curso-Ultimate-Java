package Ejercicios;

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        terminal: while (true) {
            mostrarOpciones();
            byte input = scanner.nextByte();

            switch (input){
                case 1:
                    int result = calculadora(scanner);
                    System.out.println("El valor de la suma es: ");
                    System.out.println(result);
                    break;
                case 2:
                    hackeandoNasa();
                    break;
                case 3:
                    System.out.println("Chao mundo!");
                    break terminal;
                default:
                    System.out.println("Comando no válido");
                    break;
            }

        }
    }

    static void mostrarOpciones() {
        System.out.println("Ingresa una opción:");
        System.out.println("1.- Ejercicios.Calculadora");
        System.out.println("2.- Hackear la nasa 😎");
        System.out.println("3.- Salir");
    }

    static void hackeandoNasa() {
        System.out.println("Hackeando la nasa");
        System.out.println("#");
        System.out.println("##");
        System.out.println("###");
        System.out.println("####");
        System.out.println("Eres un hacker, la nasa ha sido hackeada 😎\n");
    }

    static int calculadora (Scanner scanner) {
        System.out.println("CALCULADORA DE LA GOD BROTHER");
        System.out.println("Ingresa el primer número:");

        int a = scanner.nextInt();

        System.out.println("Ingresa el segundo número:");
        int b = scanner.nextInt();

        return a + b;
    }
}
