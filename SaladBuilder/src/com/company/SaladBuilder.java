package com.company;

public abstract class SaladBuilder {

    Salad salad = new Salad();
    abstract void buildBowlSize();
    abstract void buildMeat();
    abstract void buildCheese();
    abstract void buildSauce();
    abstract void buildSeeds();
    abstract void buildVeggies();

    Salad build(){
        return salad;
    };
}
