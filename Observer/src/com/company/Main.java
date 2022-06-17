package com.company;

public class Main {

    public static void main(String[] args) {
        Coach coach = new Coach();
        HeadHunter headHunter = new HeadHunter();

        Player firstPlayer = new Player("Wayne", "Chelsea", 60);
        firstPlayer.addObserver(coach);
        firstPlayer.addObserver(headHunter);
        firstPlayer.updatedGoalsScored(1);

        Player secondPlayer = new Player("Tim", "Manchester United", 40);
        secondPlayer.addObserver(headHunter);
        secondPlayer.addObserver(coach);
        secondPlayer.updatedGoalsScored(2);

        secondPlayer.deleteObserver(coach);
        secondPlayer.updatedGoalsScored(6);
    }
}
