package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        
     }
}


/*

DROP TABLE IF EXISTS movies;
CREATE TABLE movies (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    director VARCHAR(255) NOT NULL,
    mdate VARCHAR(100) NOT NULL
);


INSERT INTO movies (title, director, mdate) VALUES
('Mano Po', 'Joey Reyes', '04/06/2026'),
('Titanic', 'Steven S', '02/04/1998')


select * from movies;
get
http://localhost:1983/bookshop/movies/all
get
http://localhost:1983//bookshop/movies/1
post
http://localhost:1983//bookshop/movies
{
  "title": "Serendipity",
  "director": "Peter Chelsom",
  "mdate": "04/13/2026"
}
delete
http://localhost:1983//bookshop/movies/1
         */