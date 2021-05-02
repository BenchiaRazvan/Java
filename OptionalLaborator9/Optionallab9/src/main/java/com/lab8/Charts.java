package com.lab8;

import com.lab8.entity.GenresEntity;
import com.lab8.entity.MoviesEntity;
import com.lab8.util.SingletonEntity;
import org.testng.annotations.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.sql.Timestamp;

public class Charts{

    private int id;
    private String title;
    private Timestamp releaseDate;
    private int rating;

    public int getId() {
        return id;
    }

    public int getRating() {
        return rating;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public Timestamp getReleaseDate() {
        return releaseDate;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setReleaseDate(Timestamp releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Charts{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", rating=" + rating +
                '}';
    }
}
