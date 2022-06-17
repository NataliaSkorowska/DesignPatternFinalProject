package com.company;

public class SoftCover implements BookFactory{
    @Override
    public Book createBook(String bookType) {
        System.out.println("Czytam książkę w miękkiej oprawie");
        switch (bookType) {
            case "podrecznik":
                return new Coursebook();
            case "biografia":
                return new Biography();
            case "fantasy":
                return new Fantasy();
            case "przygodowa":
                return new Adventure();
            default:
                throw new UnsupportedOperationException("Nieznany rodzaj książki!");
        }
    }
}
