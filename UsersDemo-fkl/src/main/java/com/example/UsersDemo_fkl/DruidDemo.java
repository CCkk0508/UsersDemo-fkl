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
////        1.����jar��
////        2.���������ļ�
////        3.���������ļ�
//
//        Properties properties = new Properties();
//        InputStream inputStream = DruidDemo.class.getClassLoader().getResourceAsStream("druid.properties");
//        try {
//            properties.load(inputStream);
////            4.��ȡ���ӳض���
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
