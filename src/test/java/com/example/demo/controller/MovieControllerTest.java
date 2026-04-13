package com.example.demo.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import com.example.demo.dao.Movie;
import com.example.demo.service.MovieService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;




@WebMvcTest(MovieController.class)
class MovieControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MovieService movieService;


    @Test
    void testAuth() throws Exception {

        Movie savedMovie = new Movie();
        savedMovie.setId(1);
        savedMovie.setTitle("One Piece");
        savedMovie.setDirector("Director J");
        savedMovie.setMdate("2/15/2024");

        when(movieService.create(org.mockito.ArgumentMatchers.any(Movie.class)))
                .thenReturn(savedMovie);

        String requestBody = """
            {
              "title": "One Piece",
              "director": "Director J",
              "mdate": "2/15/2024"
            }
        """;

        mockMvc.perform(post("/bookshop/movies")
        .contentType(MediaType.APPLICATION_JSON)
        .content(requestBody))
        .andExpect(status().isForbidden()) //due to user auth
   
       ;
    }
}