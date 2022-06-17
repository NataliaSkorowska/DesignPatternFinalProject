package com.company;

public class BookUser {
    private Book borrowed;
    private boolean haveBook = false;
    public void borrowBook(){
        borrowed= Book.borrowed();
        if(borrowed==null){
            haveBook = false;
        }else haveBook = true;
    }
    public String getBookInfo(){
        if(haveBook){
            return borrowed.getBookInfo();
        }else
            return "Brak wypożyczonych pozycji";
    }
}
