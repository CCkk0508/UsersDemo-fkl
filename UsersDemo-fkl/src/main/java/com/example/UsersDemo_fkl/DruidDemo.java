package com.example.UsersDemo_fkl;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.example.UsersDemo_fkl.utils.JDBCUtils;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DruidDemo {

    public static void main(String[] args) {
////        1.导入jar包
////        2.定义配置文件
////        3.加载配置文件
//
//        Properties properties = new Properties();
//        InputStream inputStream = DruidDemo.class.getClassLoader().getResourceAsStream("druid.properties");
//        try {
//            properties.load(inputStream);
////            4.获取连接池对象
//            DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
//                Connection connection = dataSource.getConnection();
//                System.out.println(connection);
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = JDBCUtils.getConnection();
            String sql = "select * from usermanager";
             preparedStatement = connection.prepareStatement(sql);
             resultSet = preparedStatement.executeQuery();
            System.out.println(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(resultSet,preparedStatement,connection);
        }
    }
}
