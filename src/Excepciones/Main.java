package Excepciones;

/**
 * Archivo Excepciones.Colecciones.Lambda.Streams.Main para explicar las excepciones
 */
public class Main {
    public static void main(String[] args) {
        try {
            Demo.start();
        } catch (Throwable e) {
            var cause = e.getCause();
            cause.printStackTrace();
//            System.out.println("Ocurrió un error: " + cause.getMessage());
        }
    }
}
