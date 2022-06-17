package com.company;

public class ToyCry implements ToyState {
    private final Toy toy;

    public ToyCry(Toy toy){
        this.toy = toy;
    }

    @Override
    public void walk() {
        System.out.println("Lalka jest w trybie chodzenia");
        toy.setToyState(toy.getToyOn());
    }

    @Override
    public void cry() {
        System.out.println("Lalka płacze");
    }

    @Override
    public void off() {
        System.out.println("Nie można wyłączyć lalki, gdy płacze");
    }
}
