package com.example.UsersDemo_fkl.dao;

import com.example.UsersDemo_fkl.domain.User;

import java.util.List;

public interface UserDao {

    public List<User> findAll();

    void add(User user);

    void delete(int id);

    User findById(int parseInt);
}
