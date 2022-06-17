package com.company;

public class SpicySandwichFactory implements SandwichFactory {
    public Sandwich createSandwich() {
        return new SpicySandwich();
    }
}
