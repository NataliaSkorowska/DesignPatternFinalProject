package com.company;

public class Main {

    public static void main(String[] args) {

        GoalKeeper goalKeeper = new GoalKeeper(new CatchingBall(), 3);
        Defender defender = new Defender(new ShotAtFieldGoal(), 1);
        MidFielder midFielder = new MidFielder(new CornerKick(),4);

        goalKeeper.beAGoalkeeper();
        goalKeeper.attack();

        defender.doDefenderJob();
        defender.attack();
        System.out.println(defender.getPointsScored());

        midFielder.beAMidFielder();
        midFielder.attack();

        goalKeeper.setActionInterface(new CornerKick());
        goalKeeper.beAGoalkeeper();
        goalKeeper.attack();
    }
}
