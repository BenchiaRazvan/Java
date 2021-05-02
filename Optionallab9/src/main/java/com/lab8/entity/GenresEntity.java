package com.lab8.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "genres", schema = "javadatabase", catalog = "")
public class GenresEntity {
    private int id;
    private String nume;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NUME")
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenresEntity that = (GenresEntity) o;
        return id == that.id && Objects.equals(nume, that.nume);
    }

    @Override
    public String toString() {
        return "GenresEntity{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nume);
    }
}
