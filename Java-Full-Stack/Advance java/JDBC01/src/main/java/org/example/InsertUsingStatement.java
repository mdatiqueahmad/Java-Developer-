package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUsingStatement {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/spark6";
        String password="Atique@0705";
        String username="root";

        String sql= """
                        INSERT INTO employee
                        VALUES (4,"ADITYA","SUPPORT", 40000)
                """;

        try{
            Connection connection= DriverManager.getConnection(url,username,password);

            Statement statement=connection.createStatement();
          int row=  statement.executeUpdate(sql);
            System.out.println(row+ "Row inserted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
