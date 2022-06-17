package com.company;

public class Euro implements Cantor {
    public double euroMoney = 250;

    @Override
    public String setCurrency() {
        String currencyName = "Euro";
        return currencyName;
    }

    @Override
    public double getMoney() {
        return euroMoney;
    }
}
