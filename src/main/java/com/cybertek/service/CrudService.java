package com.cybertek.service;

import java.util.List;

public interface CrudService<T,ID> {

    T save(T user);
    T findByID(ID id);
    List<T> findAll();
    void delete(T user);
    void deleteByID(ID id);
}
