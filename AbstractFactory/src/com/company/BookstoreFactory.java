package com.company;

public class BookstoreFactory {
    public static BookFactory getBook(String coverType){
        switch (coverType) {
            case "miekka":
                return new SoftCover();
            case "twarda":
                return new HardCover();
            default:
                throw new UnsupportedOperationException("Nieznany typ okładki!");
        }
    }
}
