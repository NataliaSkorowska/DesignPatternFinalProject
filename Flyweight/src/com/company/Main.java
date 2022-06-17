package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        BlindType blindType = BlindsTypeFactory.getBlindType("Dzień i noc", "len", new BigDecimal(400));
        Blind dayNightBlind = new Blind(blindType, "odcienie szarości", 100,130);
        System.out.println(dayNightBlind);

        BlindType blindType2 = BlindsTypeFactory.getBlindType("Żaluzja pionowa","drewno", new BigDecimal(230));
        Blind verticalBlind = new Blind(blindType2,"jasny dąb",85, 170);
        System.out.println(verticalBlind);

        BlindType blindType3 = BlindsTypeFactory.getBlindType("Roleta rzymska","włókna sztuczne", new BigDecimal(370));
        Blind romanBlind = new Blind(blindType3,"brąz",115, 160);
        System.out.println(romanBlind);

    }
}
