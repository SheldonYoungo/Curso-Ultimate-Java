package Genericos;

public class Mesero implements Atendible, Comparable<Mesero> {
    private int tiempo;

    public Mesero (int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public void atender() {

    }


    @Override
    public int compareTo(Mesero o) {
        return this.tiempo - o.tiempo;
    }
}
