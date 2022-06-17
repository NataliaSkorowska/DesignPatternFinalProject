package com.company;

public class PolishSandwich extends Sandwich {
    public PolishSandwich(){
        setName("Swojskie nuty");
        setDescription("Kanapka składa się ze świeżo wypiekanego chleba, posmarowanego masłem," +
                "z dwoma rodzajami kiełbasy i ogórkiem kiszonym");
        setKcal(520);
        setPrice(20);
    }

    @Override
    public void sandwichDetails() {
        super.sandwichDetails();
    }

    @Override
    public void opinionsAboutSandwich() {
        System.out.println("Smak jak dawniej na festynie - polecam.");
        System.out.println("Dużo masła i świeży chleb, bardzo dobre.");
    }

}
