package com.lab8.entity;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "charts", schema = "javadatabase", catalog = "")
public class ChartsEntity {
    private int id;
    private String title;
    private Timestamp releasedata;
    private int rating;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "releasedata")
    public Timestamp getReleasedata() {
        return releasedata;
    }

    public void setReleasedata(Timestamp releasedata) {
        this.releasedata = releasedata;
    }

    @Basic
    @Column(name = "rating")
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChartsEntity that = (ChartsEntity) o;
        return id == that.id && rating == that.rating && Objects.equals(title, that.title) && Objects.equals(releasedata, that.releasedata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, releasedata, rating);
    }
}
