package com.company;

public class Deliverer implements Tasks {
    private GlovoSystem glovoSystem;
    Deliverer(GlovoSystem glovoSystem){
        this.glovoSystem = glovoSystem;
    }
    @Override
    public void order() {
        System.out.println("Dostawca jest dostępny do odbioru zamówienia");
        glovoSystem.setStatus(true);
    }
}
