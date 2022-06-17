package com.company;

public class VegeSandwichFactory implements SandwichFactory {
    @Override
    public Sandwich createSandwich() {
        return new VegeSandwich();
    }
}
