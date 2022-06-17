package com.company;

public class GoalKeeper extends FootballPlayer {

    GoalKeeper(ActionInterface actionInterface, int pointsScored) {
        super(actionInterface, pointsScored);
    }

    public void beAGoalkeeper() {
        System.out.println("Jestem bramkarzem");
    }
}
