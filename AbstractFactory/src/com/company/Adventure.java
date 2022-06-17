package com.company;

public class Adventure implements Book {

    @Override
    public void read() {
        System.out.println("Czytam książkę przygodową");
    }
}
