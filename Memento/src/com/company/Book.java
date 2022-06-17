package com.company;

import java.util.Date;

public class Book {

    private String title;
    private String publisher;
    private String author;
    private String ISBN;
    private int pages;
    private Date modificationDate;

    public Book(){
        setModificationDate();
    }

    public Book(String title, String publisher, String author, String ISBN, int pages){
        setTitle(title);
        setPublisher(publisher);
        setAuthor(author);
        setISBN(ISBN);
        setPages(pages);
        setModificationDate();
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getPublisher(){
        return this.publisher;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public String getISBN(){
        return this.ISBN;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    public int getPages(){
        return this.pages;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public Memento undo(){
        return new Memento(title, author, publisher, ISBN, pages, modificationDate);
    }

    public void restore(Memento memento){
        setTitle(memento.getTitle());
        setAuthor(memento.getAuthor());
        setPublisher(memento.getPublisher());
        setISBN(memento.getISBN());
        setPages(memento.getPages());

        this.modificationDate = memento.getModificationDate();
    }

    public void bookInfo(){
        System.out.println("Tytuł: " + title + ", autor: " + author +
                ", wydawnictwo: " + publisher + ", numer ISBN: " + ISBN +
                ", liczba stron: " + pages);
    }

    private void setModificationDate(){
        modificationDate = new Date();
    }
}
