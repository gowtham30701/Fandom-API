package com.movie.fandom.service;

import com.movie.fandom.Movies;
import com.movie.fandom.repository.MovieRepository;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movies> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movies> getMoviesById(String id){
        return movieRepository.findMoviesByImdbId(id);
    }
}
