package Ejercicios;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;

public class Videogame {
    String name;
    double price;
    String category;
    static String[] categories = {"adventure", "rpg", "action", "racing"};

    public Videogame (String name, double price) {
        this.name = name;

        if(price < 10.0) {
            this.price = 10;
        } else {
            this.price = price;
        }

    }

    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category.toUpperCase() + ".";
    }

    public String getPrice() {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return nf.format(this.price);
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setPrice(double p) {
        this.price = p;
    }

    public void setCategory(String category) {
        boolean isInList = false;

        for (String c: Videogame.categories) {
            if (category.equals(c)) {
                this.category = category;
                isInList = true;
                break;
            }
        }

        if (!isInList) System.out.println("No existe la categoría que se desea asignar");
    }
}
