package com.example.Ticket.service;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.Ticket.repository.MovieRepository;
import com.example.ticketdomain.Movie;


@Service 
public class Movieserviceimpl implements Movieservice{
	@Autowired
	private MovieRepository movieRepository;
	@Override
	public List<Movie>getAllMovies(){
		return movieRepository.findAll();
		
		
	}
	@Override
	public void saveMovies(Movie movie) {
		// TODO Auto-generated method stub
		this.movieRepository.save(movie);
	}
	
}
