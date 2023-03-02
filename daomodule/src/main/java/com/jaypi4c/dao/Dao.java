package com.jaypi4c.dao;

import java.util.List;
import java.util.Optional;

public interface Dao<T> {

    Optional<T> findById(int id);

    List<T> findAll();

}
