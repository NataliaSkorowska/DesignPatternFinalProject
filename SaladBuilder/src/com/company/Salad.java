package com.company;

public class Salad {
    private String bowlSize;
    private String cheese;
    private String veggies;
    private String meats;
    private String sauce;
    private String seeds;

    public void setBowlSize(String bread) { this.bowlSize = bread; }

    public void setCheese(String cheese) { this.cheese = cheese; }

    public void setVeggies(String veggies) { this.veggies = veggies; }

    public void setMeats(String meats) { this.meats= meats; }

    public void setSauce(String sauce) { this.sauce = sauce; }

    public void setSeeds(String seeds) { this.seeds = seeds; }

    public void print() {
        System.out.println(
               "Szczegóły sałatki: " + bowlSize + ", " + cheese + ", " + veggies +
                      ", " + meats + ", " + sauce + ", " + seeds);
    }
}

