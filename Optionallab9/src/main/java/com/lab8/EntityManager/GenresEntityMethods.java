package com.lab8.EntityManager;

import com.lab8.entity.GenresEntity;
import com.lab8.entity.MoviesEntity;
import com.lab8.util.SingletonEntity;
import org.testng.annotations.Test;

import javax.persistence.*;
import java.util.List;

public class GenresEntityMethods implements AbstractRepositoryInterface<GenresEntity> {

    private static final EntityManagerFactory entityManagerFactory = SingletonEntity.getEntityManagerFactory();
    @Test
    @Override
    public void create(GenresEntity genresEntity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = null;
        try {
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();
            entityManager.persist(genresEntity);
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
    public void findById(GenresEntity genresEntity) {
        EntityManager em = entityManagerFactory.createEntityManager();

        String query = "SELECT genres FROM GenresEntity genres WHERE genres.id = :genresID";

        TypedQuery<GenresEntity> tq = em.createQuery(query, GenresEntity.class);
        tq.setParameter("genresID", genresEntity.getId());

        GenresEntity genre = null;

        try {
            genre = tq.getSingleResult();
            System.out.println("ID: " + genre.getId() + "  Gen: " + genre.getNume());
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
    public void findByName(GenresEntity genresEntity){
        EntityManager em = entityManagerFactory.createEntityManager();
        Query query = em.createQuery("SELECT genres from GenresEntity genres WHERE genres.nume like :name ");
        List genres = query.setParameter("name", genresEntity.getNume()).getResultList();
        em.close();
        System.out.println(genres.isEmpty()? null : genres.get(0).toString());
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
