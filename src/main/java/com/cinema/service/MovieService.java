package com.cinema.service;

import java.util.List;

import com.cinema.entity.Movies;

public interface MovieService {
	public Movies addMovie(Movies movies);

	public List<Movies> getAllMovies();	
}
