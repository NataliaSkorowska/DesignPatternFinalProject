package com.company;

import java.text.MessageFormat;

public class BankAccountProxy extends Money{
    private Account account;
    private String client = "Kowalski";
    private String password = "koW4l$ki";
    private boolean access;

    public BankAccountProxy(String client, String password){
        if (this.password == password || this.client == client){
            System.out.println("Uzyskanie dostępu");
            access = true;
        } else {
            System.out.println("Brak dostępu");
        }
    }

    @Override
    public String getMoneyAmount() {
        if (access) {
            if (account == null) {
                account = new Account();
            }
            return MessageFormat.format("Stan konta klienta o nazwisku {0} wynosi {1}", client, account.getMoneyAmount());
        } else {
            return ("Brak dostępu");
        }
    }
}
