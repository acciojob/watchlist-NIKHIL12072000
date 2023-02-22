package com.driver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MovieRepository {
    HashMap<String,Movie> movieMap;
    HashMap<String,Director> directorMap;
    HashMap<String, List<String>> directorMovieMap;
    MovieRepository(){
        movieMap=new HashMap<>();
        directorMap=new HashMap<>();
        directorMovieMap=new HashMap<>();
    }

    public void saveMovie(Movie movie){
        movieMap.put(movie.getName(),movie);
    }

    public void saveDirector(Director director){
        directorMap.put(director.getName(),director);
    }

    public void saveDirectorMovieMap(String movie, String director) {
        if(movieMap.containsKey(movie) && directorMap.containsKey(director)){
            List<String> currentMovies = new ArrayList<>();
            if(directorMovieMap.containsKey(director)) currentMovies=directorMovieMap.get(director);
            currentMovies.add(movie);
            directorMovieMap.put(director,currentMovies);
        }
    }

    public Movie findMovieByName(String name){
        if(movieMap.containsKey(name)) return movieMap.get(name);
        return null;
    }

    public Director findDirectorByName(String name) {
        if(directorMap.containsKey(name)) return directorMap.get(name);
        return null;
    }

    public List<String> findMovieByDirectorName(String name) {
        if(directorMovieMap.containsKey(name)) return directorMovieMap.get(name);
        return null;
    }

    public List<String> findAllMovies() {
        List<String> movies=new ArrayList<>();
        for(String movie:movieMap.keySet()) movies.add(movie);
        return movies;
    }
}
