package org.example;

import org.example.config.DBConfiq;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateExample {
    public static void main(String[] args) {
        String sql = """
                UPDATE employee SET sal=9000000 where id=1;
                """;

        Statement statement = DBConfiq.getInstance();

        try {
            int row= statement.executeUpdate(sql);
            if (row>0){
                System.out.println("Employee updated");
            }
            else  {
                System.out.println("Employee not found");
            }
        }  catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
