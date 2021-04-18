package com.model;

import java.sql.Timestamp;

public class Movie{

    private int id;
    private String title;
    private Timestamp releaseDate;
    private int duration;
    private int score;

    public Movie() {

    }
    public Movie(int newId, String newTitle, Timestamp newReleaseDate, int newDuration, int newScore){
        this.id = newId;
        this.title = newTitle;
        this.releaseDate = newReleaseDate;
        this.duration = newDuration;
        this.score = newScore;
    }

    public Timestamp getReleaseDate() {
        return releaseDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuration() {
        return duration;
    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public String getTitle() {
        return title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setReleaseDate(Timestamp releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", duration=" + duration +
                ", score=" + score +
                '}';
    }
}