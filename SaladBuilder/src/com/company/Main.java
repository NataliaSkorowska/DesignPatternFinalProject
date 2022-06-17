package com.company;

public class Main {

    public static void main(String[] args) {
        SaladDirector salad1 = new SaladDirector();
        salad1.setBuilder(new SpicySalad());
        buildSalad(salad1);

        SaladDirector salad2 = new SaladDirector();
        salad2.setBuilder(new VegeSalad());
        buildSalad(salad2);

    }
    private static void buildSalad(SaladDirector saladDirector) {
        Salad salad = saladDirector.buildSalad();
        salad.print();
    }

}
