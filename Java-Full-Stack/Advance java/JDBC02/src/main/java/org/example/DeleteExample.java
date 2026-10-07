package org.example;

import org.example.config.DBConfiq;

import java.sql.SQLException;
import java.sql.Statement;

public class DeleteExample {
    public static void main(String[] args) {
        try {
          Statement statement= DBConfiq.getInstance();

          int row=statement.executeUpdate("DELETE FROM employee where id=4");
            System.out.println(row+ " row deleted ");
            int row2=statement.executeUpdate("INSERT INTO employee (id, name, dep, sal) VALUES (15, 'Lalit', 'civil', 789456)" );
            System.out.println(row2+ " row inserted ");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
