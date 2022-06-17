package com.company;

public class FilmFan {
    FilmwebComponent movieList;

    public FilmFan(FilmwebComponent movieList){
        this.movieList = movieList;
    }

    public void getMovieList(){
        movieList.displayMovieInfo();
    }
}
