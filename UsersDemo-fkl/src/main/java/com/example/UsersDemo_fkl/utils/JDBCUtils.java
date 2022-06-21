package com.example.UsersDemo_fkl.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Druid���ӳع�����
 */
public class JDBCUtils {
    //�����Ա����dataSource
    private static DataSource dataSource;

    static {
        try {
            //1.���������ļ�
            Properties properties = new Properties();
            properties.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            //2.��ȡ����Դ��DataSource��
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * ��ȡ���Ӷ���
     *
     * @return
     * @throws SQLException
     */
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    /**
     * �ͷ���Դ
     *
     * @param statement
     * @param connection
     */
    public static void close(Statement statement, Connection connection) {
        close(null, statement, connection);
    }

    /**
     * �ͷ���Դ
     *
     * @param resultSet
     * @param statement
     * @param connection
     */
    public static void close(ResultSet resultSet, Statement statement, Connection connection) {
        if (resultSet != null) {
            try {
                resultSet.close();//�ر���Դ
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (statement != null) {
            try {
                statement.close();//�ر���Դ
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();//�黹���ӳ���Դ
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * ��ȡ���ӳصķ���
     * @return
     */

    public static DataSource getDataSource() {
        return dataSource;
    }

}
