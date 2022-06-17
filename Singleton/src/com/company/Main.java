package com.company;

public class Main {

    public static void main(String[] args) {
        BookUser firstBookUser = new BookUser();
        BookUser secondBookUser = new BookUser();

        firstBookUser.borrowBook();
        System.out.println("Użytkownik 1:");
        System.out.println(firstBookUser.getBookInfo());
        System.out.println();

        secondBookUser.borrowBook();
        System.out.println("Użytkownik 2:");
        System.out.println(secondBookUser.getBookInfo());
    }
}
