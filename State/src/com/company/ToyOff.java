package com.company;

public class ToyOff implements ToyState{
    private final Toy toy;

    public ToyOff(Toy toy){
        this.toy = toy;
    }

    @Override
    public void walk() {
        System.out.println("Lalka chodzi");
        toy.setToyState(toy.getToyOn());
    }

    @Override
    public void cry() {
        System.out.println("Lalka nie może płakać, gdy jest wyłączona");
    }

    @Override
    public void off() {
        System.out.println("Lalka już jest wyłączona");
    }
}
