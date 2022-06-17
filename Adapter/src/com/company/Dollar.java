package com.company;

public class Dollar implements Cantor {
    Euro eu;

    public Dollar (Euro eu){
        this.eu = eu;
    }

    @Override
    public String setCurrency() {
        String currencyName = "Dolar";
        return currencyName;
    }

    @Override
    public double getMoney() {
        double dollarMoney = eu.getMoney() * 1.05;
        return dollarMoney;
    }
}
