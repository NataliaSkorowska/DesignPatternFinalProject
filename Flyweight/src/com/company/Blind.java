package com.company;
import java.math.BigDecimal;

public class Blind {
    private BlindType blindType;
    private String color;
    private int width;
    private int height;

    public Blind(BlindType blindType, String color, int width, int height) {
        this.blindType = blindType;
        this.color = color;
        this.width= width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Szczegóły zamówionej rolety: " +
                 blindType +
                ", kolor=" + color +
                ", wysokość rolety=" + height + " cm" +
                ", szerokość rolety=" + height + " cm";
    }
}
