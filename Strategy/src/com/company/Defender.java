package com.company;

public class Defender extends FootballPlayer{

    public Defender(ActionInterface actionInterface, int pointsScored) {
        super(actionInterface,pointsScored);
    }

    public void doDefenderJob(){
        System.out.println("Jestem obrońcą");
    }
}