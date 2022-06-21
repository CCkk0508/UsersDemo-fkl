package com.example.UsersDemo_fkl.dao.impl;

import com.example.UsersDemo_fkl.JDBCTemplateDemo;
import com.example.UsersDemo_fkl.dao.UserDao;
import com.example.UsersDemo_fkl.domain.User;
import com.example.UsersDemo_fkl.utils.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<User> findAll() {
        String sql = "select * from usermanager";
        List<User> users = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return users;
    }
}
