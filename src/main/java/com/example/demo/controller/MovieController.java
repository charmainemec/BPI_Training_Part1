package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.dao.Movie;
import com.example.demo.dto.MovieDTO;
import com.example.demo.service.MovieService;


import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/bookshop/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    private MovieDTO toDTO(Movie movie) {
        return new MovieDTO(
                movie.getTitle(),
                movie.getDirector(),
                movie.getMdate()
        );
    }

    private Movie toEntity(MovieDTO dto) {
        return new Movie(
                dto.getTitle(),
                dto.getDirector(),
                dto.getMdate()
        );
    }

    // /bookshop/movies/all - display all movies
    @GetMapping("/all")
    public List<MovieDTO> getAllMovies() {
        return movieService.getAll()
                .stream()
                .map(this::toDTO)
                .toList();
    }

     
    // /bookshop/movies/id - display movie by id
	@GetMapping("/{id}")
	public MovieDTO getMovie(@PathVariable int id) {
	    return toDTO(movieService.getById(id));
	}
	
	// /bookshop/movies - save movie using json as body
	@PostMapping
	public ResponseEntity<MovieDTO> createMovie(@RequestBody MovieDTO dto) {
	    Movie movie = movieService.create(toEntity(dto));
	    return ResponseEntity
	            .created(URI.create("/bookshop/movies/" + movie.getId()))
	            .body(toDTO(movie));
	}
	
	// /bookshop/movies/all - delete movie by id
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteMovie(@PathVariable int id) {
	    Movie movie = movieService.getById(id);
	    String returnMessage = movieService.delete(movie);
	    return ResponseEntity.ok(returnMessage);
	}
}
