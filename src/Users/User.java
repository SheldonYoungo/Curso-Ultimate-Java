package Users;

public class User {
    double id = Math.random();
    String name;
    String email;
    static String tableName = "user";

    private String password = "12*$+¨}[";

    public User(String name) {
        this.name = name;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void login(){
        System.out.println("Llamando base de datos...");
    }

    private void validatePassword() {
        System.out.println("Verificar contraseña");
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        System.out.println("Encriptando clave...");
        String encryptedPassword = password;
        this.password = encryptedPassword;
    }
}