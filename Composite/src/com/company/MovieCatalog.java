package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class MovieCatalog extends FilmwebComponent{
    ArrayList movieComponent = new ArrayList();

    String catalogName;
    public MovieCatalog(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getCatalogName() {
        return catalogName;
    }

    @Override
    public void add(FilmwebComponent filmwebComponent) {
        movieComponent.add(filmwebComponent);
    }

    @Override
    public void displayMovieInfo() {
        System.out.println(catalogName);
        Iterator movieIterator = movieComponent.iterator();
        while (movieIterator.hasNext()){
            FilmwebComponent movieInfo = (FilmwebComponent) movieIterator.next();
            movieInfo.displayMovieInfo();
        }
    }
}
