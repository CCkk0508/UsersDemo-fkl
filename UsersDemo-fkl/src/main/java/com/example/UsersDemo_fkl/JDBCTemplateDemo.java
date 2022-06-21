package com.example.UsersDemo_fkl;

import com.example.UsersDemo_fkl.domain.User;
import com.example.UsersDemo_fkl.utils.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class JDBCTemplateDemo {
    public static void main(String[] args) {
//    1.导入jar包
//    2.创建JDBCTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
//    3.调用方法
//        String sql = "update usermanager set age=25 where id=?";
//        int i = jdbcTemplate.update(sql, 1);
//        String sql = "insert into usermanager(id,name,sex) values(?,?,?)";
//        int i = jdbcTemplate.update(sql, null, "小李", "女");
//        System.out.println(i);
        String sql = "select * from usermanager";
        List<User> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        for (User user:list) {
            System.out.println(user);
        }
//        List<User> list = jdbcTemplate.query(sql, new RowMapper<User>() {
//            @Override
//            public User mapRow(ResultSet resultSet, int i) throws SQLException {
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                String sex = resultSet.getString("sex");
//                int age = resultSet.getInt("age");
//                String address = resultSet.getString("address");
//                String qq = resultSet.getString("qq");
//                String email = resultSet.getString("email");
//                User user = new User();
//                user.setId(id);
//                user.setName(name);
//                user.setSex(sex);
//                user.setAge(age);
//                user.setAddress(address);
//                user.setQq(qq);
//                user.setEmail(email);
//                return user;
//            }
//        });
//
//        for (User user:list) {
//            System.out.println(user);
//        }

    }

}
