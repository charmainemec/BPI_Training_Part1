package com.example.demo.dto;

public class MovieDTO {

    private String title;
    private String director;
    private String mdate;

    public MovieDTO() {
    }

    public MovieDTO(String title, String director, String mdate) {
        this.title = title;
        this.director = director;
        this.mdate = mdate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getMdate() {
        return mdate;
    }

    public void setMdate(String mdate){
        this.mdate = mdate;
    }
}
