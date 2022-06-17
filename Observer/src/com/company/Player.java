package com.company;
import java.util.Observable;

public class Player extends Observable{
        private String name;
        private String club;
        private int goalsScored;
        private int previousGoalsScored;

        public Player(String name, String club, int goalsScored) {
            this.name = name;
            this.club = club;
            this.goalsScored = goalsScored;
        }

        public void updatedGoalsScored(int goalsNumber) {
            this.previousGoalsScored = this.goalsScored;
            this.goalsScored = this.goalsScored + goalsNumber;
            setChanged();
            notifyObservers("Liczba strzelonych goli zawodnika "+ this.name+ " z klubu " + this.club+
                    " zmieniła się po ostatnim meczu z " + this.previousGoalsScored+ " na "+this.goalsScored + " strzelonych bramek");
        }
}
