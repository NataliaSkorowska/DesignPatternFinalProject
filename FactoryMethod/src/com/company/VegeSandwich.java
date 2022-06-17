package com.company;

public class VegeSandwich extends Sandwich{

    public VegeSandwich(){
        setName("Wegański smak");
        setDescription("Kanapka składa się z chleba razowego posmarowanego hummusem." +
                "Zawiera plaster tofu, nasiona dyni, pomidora i paprykę");
        setKcal(420);
        setPrice(16);
    }

    @Override
    public void sandwichDetails() {
        super.sandwichDetails();
    }

    @Override
    public void opinionsAboutSandwich() {
        System.out.println("Bardzo smaczne, tofu miało świetną konsystencję");
        System.out.println("Chrupiąca na zewnątrz i pełna smaków - super!");
    }
}
