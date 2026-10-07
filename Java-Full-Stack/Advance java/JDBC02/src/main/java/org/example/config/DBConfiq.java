package org.example.config;

import java.sql.*;

public class DBConfiq {
   static String url="jdbc:mysql://localhost:3306/spark6";
  static   String password="Atique@0705";
   static String username="root";

    public static Statement getInstance()  {
        try {
            Connection connection= DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();
            return  statement;
        } catch (
    SQLException e) {

        throw new RuntimeException(e);
    }
    }


    public static Connection getConnection()
    {
        Connection connection=null;
        try {
             connection= DriverManager.getConnection(url,username,password);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
