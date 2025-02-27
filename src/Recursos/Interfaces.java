package Recursos;

public class Interfaces {
    public static void main(String[] args) {
        Meseros m1 = new Meseros();
        Meseros m2 = new Meseros();
        Meseros m3 = new Meseros();
        Cocinero c = new Cocinero();
        Restaurante r = new Restaurante();
        r.setMeseros(new Atendible[] { m1, m2, m3 , c });

        Cocinable cs = new Cocinero();
        cs.cocinar();
    }
}
