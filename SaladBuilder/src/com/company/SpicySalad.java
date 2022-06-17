package com.company;

public class SpicySalad extends SaladBuilder {

        @Override
        public void buildBowlSize() {
            salad.setBowlSize("średnia");
        }
        @Override
        public void buildMeat() {
            salad.setMeats("kurczak w pikantnej panierce");
        }
        @Override
        public void buildCheese() {
            salad.setCheese("parmezan");
        }
        @Override
        public void buildSauce() {
            salad.setSauce("pomidorowy ostry");
        }
        @Override
        public void buildSeeds() {
        salad.setSeeds("słonecznik");
        }

        @Override
        public void buildVeggies() {
        salad.setVeggies("papryka, ogórek kiszony, marchewka");
        }
}

