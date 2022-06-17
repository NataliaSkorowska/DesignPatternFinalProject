package com.company;

public class Biography implements Book {

    @Override
    public void read() {
        System.out.println("Czytam biografię");
    }
}
