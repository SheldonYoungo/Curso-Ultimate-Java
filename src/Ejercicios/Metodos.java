package Ejercicios;

public class Metodos {
    public static void main(String[] args) {
        miMetodo("Sheldon", "Youngo");
        int result = suma(20,20);
        int result2 = suma(20,20,20);
        String text = suma();
        int result3 = suma(new int[] {2,5,62,10026,45});
        System.out.println(result);
        System.out.println(result2);
        System.out.println(text);
        System.out.println(result3);
    }

    static void miMetodo(String nombre, String apellido) {
        System.out.println("Hola " + nombre + " " + apellido);
    }

    static int suma(int a, int b) {
        return a+b;
    }

    static int suma(int a, int b, int c) { //Metodo overloading
        return a+b+c;
    }

    static String suma() { //Metodo overloading
        return "HOla mundo";
    }

    static int suma(int[] numeros){
        int result = 0;

        for(int numero: numeros){
            result += numero;
        }

        return result;
    }
}
