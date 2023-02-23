package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MovieService {

    MovieService(){}

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

    public void deleteAllDirectors() {
         movieRepository.deleteAllDirectors();
    }

    public void deleteDirectorByName(String name) {
        movieRepository.deleteDirectorByName(name);
    }
}
