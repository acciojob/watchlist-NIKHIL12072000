package com.driver;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public void addMovie(Movie movie){
        movieRepository.saveMovie(movie);
    }

    public void addDirector(Director director) {
        movieRepository.saveDirector(director);
    }

    public void addMovieDirectorPair(String movie, String director) {
        movieRepository.saveDirectorMovieMap(movie,director);
    }

    public Movie getMovieByName(String name) {
        return movieRepository.findMovieByName(name);
    }

    public Director getDirectorByName(String name) {
        return movieRepository.findDirectorByName(name);
    }

    public List<String> getMoviesByDirectorName(String name) {
        return movieRepository.findMovieByDirectorName(name);
    }

    public List<String> findAllMovies() {
        return movieRepository.findAllMovies();
    }
}
