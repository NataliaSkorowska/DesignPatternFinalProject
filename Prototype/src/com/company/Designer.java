package com.company;

public class Designer {
    public static void main(String[] args) {
        Dress koktailowa = new Dress ("koktailowa", "aksamit", 150);
        Dress klon1 = (Dress)koktailowa.Clone();
        Dress klon2 = (Dress)koktailowa.Clone();
        Dress klon3 = (Dress)koktailowa.Clone();

        klon1.setDressLength(140);
        klon2.setDressMaterial("jedwab");
        klon3.setDressLength(160);
        klon3.setDressName("balowa");

        System.out.println(koktailowa);
        System.out.println("Klon 1: " + klon1);
        System.out.println("Klon 2: " + klon2);
        System.out.println("Klon 3: " + klon3);
    }

}
