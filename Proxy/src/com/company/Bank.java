package com.company;

public class Bank {
    public static void main(String[] args) {
        BankAccountProxy kowalski = new BankAccountProxy("kowalski", "koW4l$ki");
        System.out.println(kowalski.getMoneyAmount());

        BankAccountProxy kowalska = new BankAccountProxy("kowalska", "koW4l$kA");
        System.out.println(kowalska.getMoneyAmount());
    }
}
