package com.example.UsersDemo_fkl.seivice;

import com.example.UsersDemo_fkl.domain.User;

import java.util.List;

public interface UserService {
    /**
     * 查询所有用户
     */
    public List<User> findAll();
    void addUser(User user);

    void deleteUser(String id);

    User findUserById(String id);

    void updateUser(User user);
}
