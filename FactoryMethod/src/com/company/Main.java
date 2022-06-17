package com.company;

public class Main {

    public static void main(String[] args) {
        SandwichFactory spicySandwichFactory = new SpicySandwichFactory();
        SandwichFactory vegeSandwichFactory = new VegeSandwichFactory();
        SandwichFactory polishSandwichFactory = new PolishSandwichFactory();

        Sandwich spicySandwich = spicySandwichFactory.createSandwich();
        Sandwich vegeSandwich = vegeSandwichFactory.createSandwich();
        Sandwich polishSandwich = polishSandwichFactory.createSandwich();

        spicySandwich.sandwichDetails();
        spicySandwich.opinionsAboutSandwich();
        System.out.println();

        vegeSandwich.sandwichDetails();
        vegeSandwich.opinionsAboutSandwich();
        System.out.println();

        polishSandwich.sandwichDetails();
        polishSandwich.opinionsAboutSandwich();
    }
}
