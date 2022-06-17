package com.company;

public class Book {

    private String author;
    private String title;
    private String publisher;

    private static Book book;
    private static boolean isBorrowed;

    private Book(){
        author = "Robert C. Martin";
        title  = "Czysty kod";
        publisher = "Helion";
        book = null;
        isBorrowed= false;
    }

    static Book borrowed() {
        if (!isBorrowed) {
            if (book == null) {
                book = new Book();
            }
            isBorrowed = true;
            return book;
        }
        return null;
    }
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher(){
        return publisher;
    }

    public String getBookInfo(){
        return "Tytuł: " + getTitle() +  "\n" +
                "Autor: " + getAuthor() + "\n"
                + "Wydawnictwo: " + getPublisher();
    }

}
