package com.lab8.EntityManager;

import com.lab8.entity.MoviesEntity;
import com.lab8.util.SingletonEntity;
import org.testng.annotations.Test;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

public class MoviesEntityMethods implements  RepositoryMovieEntity{

    private static final EntityManagerFactory entityManagerFactory = SingletonEntity.getEntityManagerFactory();
    @Test
    @Override
    public void create(MoviesEntity moviesEntity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;

        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(moviesEntity);
            entityTransaction.commit();
        } catch (Exception ex) {
            if (entityTransaction != null) {
                entityTransaction.rollback();
            }
            ex.printStackTrace();
        } finally {
            entityManager.close();
        }
    }
    @Test
    @Override
    public void findById(MoviesEntity moviesEntity) {
        EntityManager em = entityManagerFactory.createEntityManager();

        String query = "SELECT movies FROM MoviesEntity movies WHERE movies.id = :moviesID";

        TypedQuery<MoviesEntity> tq = em.createQuery(query, MoviesEntity.class);
        tq.setParameter("moviesID", moviesEntity.getId());

        MoviesEntity movie = null;

        try {
            movie = tq.getSingleResult();
            System.out.println("ID: " + movie.getId() + " TITLU: " + movie.getTitle() +  " DATA LANSARII: " + movie.getReleaseDate() + " TIMP: " + movie.getDuration() + " SCOR: " + movie.getScore());
        }
        catch (NoResultException ex) {
            ex.printStackTrace();
        }
        finally {
            em.close();
        }
    }
    @Test
    @Override
    public void findByName(MoviesEntity moviesEntity){
        EntityManager em = entityManagerFactory.createEntityManager();
        Query query = em.createQuery("SELECT movie from MoviesEntity movie WHERE movie.title like :title ");
        List movies = query.setParameter("title", moviesEntity.getTitle()).getResultList();
        em.close();
        System.out.println(movies.isEmpty()? null : movies.get(0).toString());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
