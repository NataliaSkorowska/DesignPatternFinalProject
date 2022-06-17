package com.company;

public class Bunny extends Pet {
    @Override
    public String getPetType() {
        return("królik");
    }
    @Override
    public String getPetSize() {
        return("mały");
    }
    @Override
    public String getPetFeeding() {
        return("roślinożerny");
    }
}
