package Recursos;

public abstract class Base {
    protected String name;

    public Base (String x) {
        this.name = x;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public final String miMetodo() {
        return "Hola mundo";
    }

    public abstract void guardar();
}
