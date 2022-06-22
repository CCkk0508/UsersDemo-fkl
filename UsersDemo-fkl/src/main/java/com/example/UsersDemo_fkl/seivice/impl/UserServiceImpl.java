package com.example.UsersDemo_fkl.seivice.impl;

import com.example.UsersDemo_fkl.dao.UserDao;
import com.example.UsersDemo_fkl.dao.impl.UserDaoImpl;
import com.example.UsersDemo_fkl.domain.PageBean;
import com.example.UsersDemo_fkl.domain.User;
import com.example.UsersDemo_fkl.seivice.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();

    @Override
    public List<User> findAll() {
        return dao.findAll();
    }

    @Override
    public void addUser(User user) {
        dao.add(user);

    }

    @Override
    public void deleteUser(String id) {
        dao.delete(Integer.parseInt(id));
    }

    @Override
    public User findUserById(String id) {
        return dao.findById(Integer.parseInt(id));
    }

    @Override
    public void updateUser(User user) {
        dao.update(user);
    }

    @Override
    public PageBean<User> findUserByPage(String xcurrentPage, String xrows) {
        int currentPage = Integer.parseInt(xcurrentPage);
        int rows = Integer.parseInt(xrows);
        if(currentPage <= 0){
            currentPage = 1;
        }
        PageBean<User> pb = new PageBean<>();
        pb.setRows(rows);
        //调用dao查询总记录数
        int totalCount = dao.finTotalCount();
        pb.setTotalCount(totalCount);
        //调用dao查询list集合
        int start =  (currentPage-1)*rows;
        List<User> list = dao.finByPage(start, rows);
        pb.setList(list);
        //计算总页码
        int totalPage = ((totalCount%rows) == 0 ? (totalCount/rows) :(totalCount/rows)+1);
        pb.setTotalPage(totalPage);
        if(currentPage > totalPage){
            currentPage =  currentPage-1;
        }
        pb.setCurrentPage(currentPage);
        return pb;
    }
}
