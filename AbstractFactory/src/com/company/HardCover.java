package com.company;

public class HardCover implements BookFactory{
    @Override
    public Book createBook(String bookType) {
        System.out.println("Czytam książkę w twardej oprawie");
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
