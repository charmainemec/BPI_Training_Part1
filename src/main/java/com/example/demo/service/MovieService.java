package com.example.demo.service;

import com.example.demo.dao.Movie;
import com.example.demo.repository.MovieRepository;
import com.example.demo.exception.MovieException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import java.util.List;

@Service
public class MovieService {

	private static final Logger logger = LoggerFactory.getLogger(MovieService.class);

	private final MovieRepository movieRepository;

	public MovieService(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}

	public List<Movie> getAll() {
		logger.info("Getting all movies");
		return movieRepository.findAll();
	}

	public Movie getById(int id) {
		logger.info("Get movie with id: {}", id);
		return movieRepository.findById(id).orElseThrow(() -> new MovieException(id));
	}

	public Movie create(Movie movie) {
		logger.info("Creating movie: {}", movie.getTitle());
		return movieRepository.save(movie);
	}

	public String delete(Movie movie) {
		Integer id = movie.getId();
		if (!movieRepository.existsById(id)) {
			throw new MovieException(id);
		}
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		long days = ChronoUnit.DAYS.between( LocalDate.parse(movie.getMdate(), formatter), LocalDate.now());
		long years = ChronoUnit.YEARS.between(LocalDate.parse(movie.getMdate(), formatter), LocalDate.now());
		System.out.println(days);
		if (days < 7)
		{			
			return "Book cannot be deleted, book created must be least one (1) week ago";
		}else if (years > 1) {
			return "Book cannot be deleted, book created is older than 1 year";
		}else {
			movieRepository.deleteById(id);
			logger.warn("Deleting movie with id: {}", id);
			return "Book deleted";
		}			
		
	}
}