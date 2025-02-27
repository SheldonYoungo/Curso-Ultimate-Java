package Recursos;


public class Main {
    public static void main(String[] args) {
        Categorias c = new Categorias("Hogar");
        Productos p = new Productos("iPhone");
        Base[] recursos = { c, p };
        guardarRecursos(recursos);
    }

    public static void miMetodo (Base base) {
        if (base instanceof Categorias) {
            var c = (Categorias) base;
            c.metodoCategoria();
        }

        System.out.println(base.getName());
    }

    public static void guardarRecursos (Base[] recursos) {
        for (Base recurso: recursos) {
            recurso.guardar();
        }
    }
}
