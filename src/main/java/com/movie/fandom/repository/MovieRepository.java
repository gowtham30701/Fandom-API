package com.movie.fandom.repository;

import com.movie.fandom.Movies;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movies , ObjectId> {
    Optional<Movies> findMoviesByImdbId(String imdbId);
}
