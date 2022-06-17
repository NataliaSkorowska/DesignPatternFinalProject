package com.company;

import java.text.MessageFormat;

public class Account extends Money {
    private int accountBalance = 934723;

    @Override
    public String getMoneyAmount() {
        return MessageFormat.format("{0}", accountBalance);
    }
}