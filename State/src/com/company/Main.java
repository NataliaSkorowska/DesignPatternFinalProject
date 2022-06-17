package com.company;

public class Main {

    public static void main(String[] args) {
        Toy toy = new Toy();
        toy.walk();
        toy.cry();
        toy.off();

        toy.walk();
        toy.off();
        toy.cry();

    }
}
