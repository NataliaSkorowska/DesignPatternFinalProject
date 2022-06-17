package com.company;

public class Order implements Tasks{
    private GlovoSystem glovoSystem;
    Order(GlovoSystem glovoSystem){
        this.glovoSystem=glovoSystem;
    }

    @Override
    public void order() {
        if (glovoSystem.status()){
            System.out.println("Zamówienie jest gotowe do odbioru");
            glovoSystem.setStatus(false);
        } else {
            System.out.println("Zamówienie w przygotowaniu. Prosimy o cierpliwość");
        }
    }

    public void pickingOrder(){
        System.out.println("Zamówienie zostało odebrane. Wkrótce będzie u Ciebie.");
    }

    public void deliverOrder(){
        System.out.println("Zamówienie zostało dostarczone");
        glovoSystem.setStatus(true);
    }
}
