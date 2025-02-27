package Excepciones;

public class UserException extends Exception {
    public UserException(Exception e) {
        super(e);
    }
}
