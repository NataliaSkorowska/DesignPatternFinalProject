package com.company;

public class VegeSalad extends SaladBuilder {
    @Override
    public void buildBowlSize() {
        salad.setBowlSize("duża");
    }
    @Override
    public void buildMeat() {
        salad.setMeats("bezmięsna - z dodatkiem marynowanego tofu");
    }
    @Override
    public void buildCheese() {
        salad.setCheese("mozarella");
    }
    @Override
    public void buildSauce() {
        salad.setSauce("barbecue");
    }
    @Override
    public void buildSeeds() {
        salad.setSeeds("dyni");
    }

    @Override
    public void buildVeggies() {
        salad.setVeggies("pomidor, cukinia, seler");
    }
}
