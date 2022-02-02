package com.example.Ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Ticket.service.Movieservice;
import com.example.ticketdomain.Movie;

@Controller
public class TicketController {
	@Autowired
	private Movieservice movieservice;
//TO DISPLAY A LIST OG MOVIE
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("List Movies",movieservice.getAllMovies() );
		return "index";
	}
	@GetMapping("/newMovieList")
	public String shownewcustomerfrom(Model model) {
		Movie obj=new Movie();
		model.addAttribute("Customer",obj);
		return "new_cutomer";
		}
	@PostMapping("/savecustomerdetails")
	public String savecustomer(@ModelAttribute("customer")Movie movie) {
		//save employee to database
		movieservice.saveMovies(movie);
		return "redirect:/";
		}
	@GetMapping("/deletecustomer/{id}")
	public String deletecustomer(@PathVariable(value="id")long id) {
		//to delete a customer details
		return "redirect:/";
		
		
	}
		
	}

