package com.company;

public class ToyOn implements ToyState {
    private final Toy toy;

    public ToyOn(Toy toy){
        this.toy = toy;
    }

    @Override
    public void walk() {
        System.out.println("Lalka w trybie chodzenia");
    }

    @Override
    public void cry() {
        System.out.println("Lalka płacze");
        toy.setToyState(toy.getToyCry());
    }

    @Override
    public void off() {
        toy.setState(toy.getToyOff());
        System.out.println("Lalka została wyłączona");

    }
}
