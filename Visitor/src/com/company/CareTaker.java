package com.company;

public class CareTaker implements Visitor {
    private String nameOfCareTaker;

    public CareTaker( String nameOfCareTaker ) {
        super();
        this.nameOfCareTaker = nameOfCareTaker;
    }

    public String getName() {
        return nameOfCareTaker;
    }

    public void visit( Visitable visitable ) {
        Animal animal = (Animal) visitable;
        System.out.println("Opiekun: " + this.getName() + " sprawdził czystość wybiegu zwierzęciu: "
                + animal.getName());
    }
}
