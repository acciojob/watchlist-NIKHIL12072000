package com.driver;

public class Director   {
    String name;

    int numberOfMovies;
    double imdbRating;

    public Director(String name,  int numberOfMovies, double imdbRating) {
        this.name = name;
        this.imdbRating = imdbRating;
        this.numberOfMovies = numberOfMovies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public int getNumberOfMovies() {
        return numberOfMovies;
    }

    public void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }
}
