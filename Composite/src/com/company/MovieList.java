package com.company;

public class MovieList {
    public static void main(String[] args) {
        FilmwebComponent allMovieCatalog = new MovieCatalog("Wszystkie filmy");

        FilmwebComponent romance = new MovieCatalog("Romans");
        allMovieCatalog.add(romance);
        romance.add(new Movie("Pamiętnik", "Nick Cassavetes", 123));

        FilmwebComponent childrens = new MovieCatalog("Dla dzieci");
        allMovieCatalog.add(childrens);
        childrens.add(new Movie("Minionki","Pierre Coffin", 91));

        FilmwebComponent adventure = new MovieCatalog("Przygodowe");
        allMovieCatalog.add(adventure);
        adventure.add(new Movie("Indiana Jones i Królestwo Kryształowej Czaszki", "Steven Spielberg", 121));

        FilmFan filmfan = new FilmFan(allMovieCatalog);
        filmfan.getMovieList();
    }
}
