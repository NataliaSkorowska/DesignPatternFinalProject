package com.company;

public class Coursebook implements Book {
    @Override
    public void read() {
        System.out.println("Czytam podręcznik");
    }
}
