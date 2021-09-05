package ru.netology.domain;

public class MovieUnit {
    private int id;
    private int movieId;
    private String movieName;
    private int moviePrice;

    public MovieUnit(int id, int movieId, String movieName, int moviePrice) {
        this.id = id;
        this.movieId = movieId;
        this.movieName = movieName;
        this.moviePrice = moviePrice;
    }
}