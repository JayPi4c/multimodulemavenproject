package com.jaypi4c.userdao;

import com.jaypi4c.dao.Dao;
import com.jaypi4c.entity.User;
import lombok.AllArgsConstructor;

import java.util.*;

@AllArgsConstructor
public class UserDao implements Dao<User> {

    private final Map<Integer, User> users;

    public UserDao(){
        this.users = new HashMap<>();
    }

    @Override
    public Optional<User> findById(int id) {
        return Optional.ofNullable(users.get(id));
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }
}
