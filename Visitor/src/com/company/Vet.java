package com.company;

public class Vet implements Visitor{
    private String nameOfVet;

    public Vet( String nameOfVet ) {
        super();
        this.nameOfVet = nameOfVet;
    }

    public String getName()
    {
        return nameOfVet;
    }

    @Override
    public void visit( Visitable visitable ) {
        Animal animal = (Animal) visitable;
        animal.setHealthStatus("Dobry");

        System.out.println( this.getName() + " dokonał kontrolnego sprawdzenia stanu zdrowia zwierzęciu: "
                + animal.getName());
        System.out.println("Stan zdrowia zwierzęcia: " + animal.getHealthStatus());

    }
}
