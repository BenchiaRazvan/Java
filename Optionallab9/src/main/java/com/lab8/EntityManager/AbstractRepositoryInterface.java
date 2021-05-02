package com.lab8.EntityManager;

import com.lab8.entity.GenresEntity;

public interface AbstractRepositoryInterface<T>{
    void create(T entity);
    void findById(T entity);
    void findByName(T entity);
}
