package com.company;

public abstract class FootballPlayer {
    private ActionInterface actionInterface;
    private int pointsScored;

    public FootballPlayer(ActionInterface actionInterface, int pointsScored) {
        super();
        this.actionInterface = actionInterface;
        this.pointsScored = pointsScored;
    }

    public void attack(){
        actionInterface.attack();
    }

    public int getPointsScored() {
        return pointsScored;
    }

    public void setActionInterface(ActionInterface actionInterface) {
        this.actionInterface = actionInterface;
    }
}
