package com.company;

public class SpicySandwich extends Sandwich{

    public SpicySandwich(){
        setName("Próba ognia");
        setDescription("Kanapka składa się z bułki pszennej z dodatkiem ostrej papryki, " +
                "sera gouda, pikatnego salami i ostrego sosu pomidorowego.");
        setKcal(490);
        setPrice(17);
    }

    @Override
    public void sandwichDetails() {
        super.sandwichDetails();
    }

    @Override
    public void opinionsAboutSandwich() {
        System.out.println("Pikatna, ale nie paląca. Bardzo smaczna.");
        System.out.println("Świetna alternatywa dla zwykłej kanapki - dobry balans ostrości.");
    }
}
