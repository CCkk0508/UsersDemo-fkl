package com.example.UsersDemo_fkl;


import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.example.UsersDemo_fkl.domain.User;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * 查询user表，把表中数据封装成一个对象user,然后把对象转载在列表中，然后输出
 * 1.定义user类
 * 2.定义方法 public list<user> findAll(){}
 */
public class SelectUserDemo {
    public static void main(String[] args) {
        List<User> userList = new SelectUserDemo().findAll();
        System.out.println(userList);

    }


    public List<User> findAll() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        List<User> list = null;
        try {
            //1.导入jar包
            //2.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //3.获取连接
            connection = DriverManager.getConnection("jdbc:mysql:///user-system", "root", "");
            //4.定义sql
            String sql = "select * from usermanager";
            //5.获取执行sql的对象
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            //声明一个对象
            User user = null;
            list = new ArrayList<>();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String sex = resultSet.getString("sex");
                int age = resultSet.getInt("age");
                String address = resultSet.getString("address");
                String qq = resultSet.getString("qq");
                String email = resultSet.getString("email");
                user = new User();
                user.setId(id);
                user.setName(name);
                user.setSex(sex);
                user.setAge(age);
                user.setAddress(address);
                user.setQq(qq);
                user.setEmail(email);
                list.add(user);
            }


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

}
