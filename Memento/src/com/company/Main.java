package com.company;

public class Main {
    public static void main(String[] args) {
        Book firstBook = new Book("Harry Potter", "Bloomsburry", "J.K Rowling","1112223334",420);
        firstBook.bookInfo();

        CareTaker history = new CareTaker();
        history.memento = firstBook.undo();

        firstBook.setTitle("Topieliska");
        firstBook.setAuthor("Ewa Przydryga");
        firstBook.setPublisher("Muza");
        firstBook.setISBN("900192383");
        firstBook.setPages(200);
        firstBook.bookInfo();

        firstBook.restore(history.getMemento());
        firstBook.bookInfo();
    }
}
