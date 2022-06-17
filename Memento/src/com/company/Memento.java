package com.company;

import java.util.Date;

public class Memento {

    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int pages;
    private Date modificationDate;

    public Memento(String title, String author, String publisher, String isbn, int pages, Date modificationDate){
        setTitle(title);
        setAuthor(author);
        setPublisher(publisher);
        setISBN(isbn);
        setPages(pages);
        this.modificationDate = modificationDate;
    }

    public String getTitle(){
        return this.title;
    }

    private void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return this.author;
    }

    private void setAuthor(String author){
        this.author = author;
    }
    public String getPublisher(){
        return this.publisher;
    }

    private void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public String getISBN(){
        return this.isbn;
    }

    private void setISBN(String isbn){
        this.isbn = isbn;
    }
    public int getPages(){
        return this.pages;
    }

    private void setPages(int pages){
        this.pages = pages;
    }

    public Date getModificationDate(){
        return this.modificationDate;
    }
}
