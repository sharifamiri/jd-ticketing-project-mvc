package com.cybertek.service;

import java.util.List;

public interface CrudService<T,ID> {

    T save(T object);
    T findByID(ID id);
    List<T> findAll();
    void delete(T object);
    void deleteByID(ID id);
    void update(T object);
}
