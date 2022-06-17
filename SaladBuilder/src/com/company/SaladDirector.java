package com.company;

public class SaladDirector {
        private SaladBuilder saladBuilder;
        public void setBuilder(SaladBuilder saladBuilder) {
            this.saladBuilder = saladBuilder;
        }
        public Salad buildSalad() {
            saladBuilder.buildBowlSize();
            saladBuilder.buildMeat();
            saladBuilder.buildCheese();
            saladBuilder.buildSauce();
            saladBuilder.buildSeeds();
            saladBuilder.buildVeggies();
            return saladBuilder.build();
        }
}
