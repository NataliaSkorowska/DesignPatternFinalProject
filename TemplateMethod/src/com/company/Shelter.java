package com.company;

public class Shelter {
    public static void main(String[] args) {
        Pet rex = new Dog();
        System.out.println(rex.getPetInfo("Rex", 5));
        Pet mini = new Cat();
        System.out.println(mini.getPetInfo("Mini", 2));
        Pet olly = new Bunny();
        System.out.println(olly.getPetInfo("Olly", 4));
    }
}
