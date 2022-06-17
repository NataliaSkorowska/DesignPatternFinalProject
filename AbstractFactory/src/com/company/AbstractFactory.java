package com.company;

public class AbstractFactory {
    public static void main(String[] args) {
        BookFactory miekka = BookstoreFactory.getBook("miekka");
        Book miekkaFantasy = miekka.createBook("fantasy");
        Book miekkaBiografia = miekka.createBook("biografia");
        miekkaFantasy.read();
        miekkaBiografia.read();

        BookFactory twarda = BookstoreFactory.getBook("twarda");
        Book twardaFantasy = twarda.createBook("fantasy");
        Book twardaPrzygodowa = twarda.createBook("przygodowa");
        twardaFantasy.read();
        twardaPrzygodowa.read();
    }
}
