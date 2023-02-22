package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping("/movies/add-movie")
    public ResponseEntity<String> addMovie(Movie movie){
        movieService.addMovie(movie);
        return new ResponseEntity<>("Movie added Successfully", HttpStatus.CREATED);
    }

    @PostMapping("/movies/add-director")
    public ResponseEntity<String> addDirector(Director director){
        movieService.addDirector(director);
        return new ResponseEntity<>("Director added Successfully", HttpStatus.CREATED);
    }

    @PutMapping("/movies/add-movie-director-pair")
    public ResponseEntity<String> addMovieDirectorPair(String movie,String director){
        movieService.addMovieDirectorPair(movie,director);
        return new ResponseEntity<>("Movie Director Pair added Successfully", HttpStatus.CREATED);
    }

    @GetMapping("/movies/get-movie-by-name/{name}")
    public Movie getMovieByName(@RequestParam("name") String name){
        return movieService.getMovieByName(name);
    }

    @GetMapping("/movies/get-director-by-name/{name}")
    public Director getDirectorByName(@RequestParam("name") String name){
        return movieService.getDirectorByName(name);
    }

    @GetMapping("/movies/get-movies-by-director-name/{director}")
    public List<String> getMoviesByDirectorName(@RequestParam("director") String name){
        return movieService.getMoviesByDirectorName(name);
    }

    @GetMapping("/movies/get-all-movies")
    public List<String> findAllMovies(){
        return movieService.findAllMovies();
    }
}
