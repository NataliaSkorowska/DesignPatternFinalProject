package com.company;

public class Main {

    public static void main(String[] args) {

        Book firstBook = new ThrillerBook();
        System.out.println("Książka: " + firstBook.getTitle());
        System.out.println("Opis zamówienia: " + firstBook.getDescription());
        System.out.println("Cena: " + firstBook.getPrice());

        Book secondBook = new RomanticBook();
        secondBook = new Bookmark(secondBook);
        secondBook = new DedicationFromAuthor(secondBook);

        System.out.println("Książka: " + secondBook.getTitle());
        System.out.println("Opis zamówienia: " + secondBook.getDescription());
        System.out.println("Cena zamówienia: " + secondBook.getPrice());

        Book thirdBook = new HistoryBook();
        thirdBook = new FabricBookCover(thirdBook);
        System.out.println("Książka: " + thirdBook.getTitle());
        System.out.println("Opis zamówienia: " + thirdBook.getDescription());
        System.out.println("Cena zamówienia: " + thirdBook.getPrice());

    }
}

abstract class Book
{
    String title = "Any book title";
    String description = "Any book description";

    public abstract int getPrice();
    public String getTitle(){
        return title;
    }
    public String getDescription()
    {
        return description;
    }
}

abstract class BookDecorator extends Book
{
    public abstract String getDescription();
    public abstract String getTitle();
}

class ThrillerBook extends Book
{
    public ThrillerBook() {
        title = "Zaginiona dziewczyna";
        description = "Wartki, piekielnie mroczny thriller z wyrafinowaną intrygą.";
    }
    public int getPrice() {
        return 30;
    }
}
class RomanticBook extends Book
{
    public RomanticBook() {
        title = "Romeo i Julia";
        description="Jest to najsłynniejszy dramat angielskiego poety Williama Szekspira.";
    }
    public int getPrice() {
        return 45;
    }
}
class HistoryBook extends Book
{
    public HistoryBook()  {
        title = "Bitwa o Midway";
    description = "Książka opisująca najważniejszą bitwę morską XX wieku.";}
    public int getPrice() {
        return 50;
    }
}

class Bookmark extends BookDecorator
{
    Book book;
    public Bookmark(Book book) { this.book = book; }
    public String getTitle(){return book.getTitle();}
    public String getDescription() {
        return book.getDescription()
                + "Dodatkowo dołączana zakładka.";
    }
    public int getPrice() {
        return 10 + book.getPrice();
    }
}

class FabricBookCover extends BookDecorator
{
    Book book;
    public FabricBookCover(Book book) {  this.book = book;  }
    public String getTitle(){
        return book.getTitle();
    }
    public String getDescription() {
        return book.getDescription() + "Dodatkowo materiałowa okładka na książkę.";
    }
    public int getPrice() {
        return 30 + book.getPrice();
    }
}

class DedicationFromAuthor extends BookDecorator
{
    Book book;
    public DedicationFromAuthor(Book book)  {  this.book = book; }
    public String getTitle(){
        return book.getTitle();
    }
    public String getDescription() {
        return book.getDescription() + "Dodatkowo dedykacja od autora.";
    }
    public int getPrice()  {
        return 25 + book.getPrice();
    }
}

