package com.example.UsersDemo_fkl.seivice.impl;

import com.example.UsersDemo_fkl.dao.UserDao;
import com.example.UsersDemo_fkl.dao.impl.UserDaoImpl;
import com.example.UsersDemo_fkl.domain.User;
import com.example.UsersDemo_fkl.seivice.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        return dao.findAll();
    }
}
