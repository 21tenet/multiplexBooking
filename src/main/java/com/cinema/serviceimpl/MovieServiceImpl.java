package com.cinema.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinema.dao.MoviesRepository;
import com.cinema.entity.Movies;
import com.cinema.service.MovieService;
@Service
public class MovieServiceImpl implements MovieService {
@Autowired
MoviesRepository movierepositary;

@Override
public Movies addMovie(Movies movies) {
	
	return movierepositary.save(movies);
}

@Override
public List<Movies> getAllMovies() {
	List<Movies> movie=(List<Movies>) movierepositary.findAll();
	return movie;
}

	

}
