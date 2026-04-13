package com.example.demo.service;

import com.example.demo.dao.Movie;

import com.example.demo.repository.MovieRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class MovieServiceTest {

    @Mock
    private MovieRepository movieRepository;

    @InjectMocks
    private MovieService movieService;

    @Test
    void testGetAllMovies() {
        when(movieRepository.findAll())
                .thenReturn(List.of(
                        new Movie("The Time Traveller's Wife", "Unknown", "03/11/2026")
                ));

        List<Movie> movies = movieService.getAll();
        assertEquals(1, movies.size());
        verify(movieRepository).findAll();
    }

    
}