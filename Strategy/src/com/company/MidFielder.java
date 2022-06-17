package com.company;

public class MidFielder extends FootballPlayer{

    MidFielder(ActionInterface actionInterface, int pointsScored) {
        super(actionInterface, pointsScored);
    }

    public void beAMidFielder() {
        System.out.println("Jestem pomocnikiem");
    }
}
