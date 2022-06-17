package com.company;

public class PolishSandwichFactory implements SandwichFactory {
    @Override
    public Sandwich createSandwich() {
        return new PolishSandwich();
    }
}
