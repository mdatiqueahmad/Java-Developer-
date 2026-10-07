package org.example;

import java.sql.*;

public class ReadExamle {

    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/spark6";
        String password="Atique@0705";
        String username="root";
        String sql="Select * from employee";


        try {
            Connection connection= DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();

            ResultSet resultSet= statement.executeQuery(sql);

            while(resultSet.next())
            {
                int id=resultSet.getInt("id");
                String name= resultSet.getString("name");
                String dep=resultSet.getString("dep");
                double sal=resultSet.getDouble("sal");

                System.out.println(
                        id+" | " +
                                name + " | "+
                                dep + " | " +
                                sal + " | "
                );
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
