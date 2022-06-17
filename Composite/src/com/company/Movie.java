package com.company;

public class Movie extends FilmwebComponent{
    String movieName;
    String movieDirector;
    int movieLength;

    public Movie(String movieName, String movieDirector, int movieLength) {
        this.movieName = movieName;
        this.movieDirector = movieDirector;
        this.movieLength = movieLength;
    }

    @Override
    public void add(FilmwebComponent filmwebComponent) {

    }

    @Override
    public void displayMovieInfo() {
        System.out.println("Film " + movieName + " ma długość " + movieLength + " minut, a jego reżyserem jest " + movieDirector);
    }

    @Override
    public String getMovieName() {
        return movieName;
    }

    @Override
    public String getMovieDirector() {
        return movieDirector;
    }

    @Override
    public int getMovieLength() {
        return movieLength;
    }
}
