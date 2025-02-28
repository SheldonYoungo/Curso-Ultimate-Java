package Lambda;

public class Notification implements Notificable{

    @Override
    public void push(String message) {
        System.out.println("Enviando desde notification: " + message);
    }
}
