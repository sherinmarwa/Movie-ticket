package com.example.Ticket.service;

import java.util.List;

import com.example.ticketdomain.Movie;

public interface Movieservice {
	List<Movie> getAllMovies();
	void saveMovies(Movie movie);
	Movie getMovieId(long id);
	

}
