package org.example.Dynamics;

import org.example.config.DBConfiq;

import java.sql.*;
import java.util.Scanner;

public class InsertExamples {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter id: ");
        int id= scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter name: ");
        String name=scanner.nextLine();

        System.out.println("Enter department : ");
        String dep=scanner.nextLine();

        System.out.println("Enter salary: ");
        double sal=scanner.nextDouble();

//        String sql="INSERT INTO employee VALUES("+id+", '"+name +"', '"+dep + "', "+sal+")";

        String sql= """
                INSERT INTO employee (id,name ,dep,sal) VALUES (?,?,?,?)
                """;

        try {
           // Statement statement= DBConfiq.getInstance();
           Connection connection= DBConfiq.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(sql);

            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);
            preparedStatement.setString(3,dep);
            preparedStatement.setDouble(4,sal);

            int row= preparedStatement.executeUpdate();


         //   int row=statement.executeUpdate(sql);

            System.out.println(row+" employee inserted");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
