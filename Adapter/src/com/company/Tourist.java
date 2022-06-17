package com.company;

import java.text.MessageFormat;

public class Tourist {
    public static void main(String[] args) {
        Cantor dolar = new Dollar(new Euro());
        System.out.println(MessageFormat.format("Turysta będzie mieć {0} {1}ów", dolar.getMoney(), dolar.setCurrency()));
    }
}
