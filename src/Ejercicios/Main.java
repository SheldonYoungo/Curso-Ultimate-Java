package Ejercicios;

public class Main {
    public static void main (String[] args) {
        Videogame vg = new Videogame("Prince of Persia", 25);

//        vg.setName("Destiny");
//        vg.setPrice(40.0);
        vg.setCategory("adventure");

        System.out.println(vg.getName());
        System.out.println(vg.getPrice());
        System.out.println(vg.getCategory());
    }
}
