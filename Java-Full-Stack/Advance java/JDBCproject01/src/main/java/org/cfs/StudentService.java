package org.cfs;

import org.cfs.config.DBConfiq;

import java.sql.*;

public class StudentService {

    public void addStudent(Student student)
    {

           String sql= """
                    INSERT INTO students (name, email,course, marks) VALUES (?,?,?,?)
                """;
        try {
           Connection connection = DBConfiq.getConnection();
            PreparedStatement preparedStatement =connection.prepareStatement(sql);

            preparedStatement.setString(1,student.getName());
            preparedStatement.setString(2,student.getEmail());
            preparedStatement.setString(3,student.getCourse());
            preparedStatement.setDouble(4,student.getMarks());

            int rowAffected=preparedStatement.executeUpdate();
          if (rowAffected>0)
          {
              System.out.println("Student added Successfully");
          }
          preparedStatement.close();
          connection.close();


       } catch (SQLException e)
       {
           System.out.println("Errors "+ e.getMessage());
       }
   }

   public void viewALlStudent(){
        String sql="select * from students";
        try {
            Connection connection=DBConfiq.getConnection();
            PreparedStatement preparedStatement =connection.prepareStatement(sql);

            ResultSet resultSet =preparedStatement.executeQuery();

            System.out.println();
            System.out.println("Student record");
            System.out.println("...........................");
            while(resultSet.next())
            {
                int id=resultSet.getInt(("id"));
                String name= resultSet.getString("name");
                String email = resultSet.getString("email");
                String course=resultSet.getString("course");
                double marks=resultSet.getDouble("marks");

                System.out.println("ID "+ id);
                System.out.println("name " + name);
                System.out.println("email "+ email);
                System.out.println("course "+course);
                System.out.println("marks "+ marks);

                System.out.println(".................");


            }

            resultSet.close();
            preparedStatement.close();
            connection.close();
        }catch (SQLException e)
        {
            System.out.println("Error "+ e.getMessage());
        }
   }

   public void searchStudent(int id ){
        String sql= """
                SELECT * FROM students where id=?
                """;

        try{
            Connection connection=DBConfiq.getConnection();
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next())
            {
                System.out.println();
                System.out.println("Student found");

                System.out.println("Id: "+resultSet.getInt("id"));
                System.out.println("name: "+resultSet.getString("name"));
                System.out.println("email: "+resultSet.getString("email"));
                System.out.println("course: "+resultSet.getString("course"));
                System.out.println("marks: "+resultSet.getDouble("marks"));

            }
            System.out.println("Student not found: ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
   }

   public  void updateStudent(Student student){
       String sql = """
        UPDATE students
        SET name = ?, email = ?, course = ?, marks = ?
        WHERE id = ?
        """;

       Connection connection=DBConfiq.getConnection();
       try {
           PreparedStatement preparedStatement = connection.prepareStatement(sql);

           preparedStatement.setString(1, student.getName());
           preparedStatement.setString(2, student.getEmail());
           preparedStatement.setString(3, student.getCourse());
           preparedStatement.setDouble(4, student.getMarks());
           preparedStatement.setInt(5, student.getId());

           int row = preparedStatement.executeUpdate();

           if (row>0){
               System.out.println("Student Upadted ");
           }
           else  {
               System.out.println("Student not found");
           }
       }  catch (SQLException e) {
           throw new RuntimeException(e);
       }
   }

   public  void deleteStudent(int id){
        String sql= """
                DELETE FROM students where id=?
                """;
       Connection connection=DBConfiq.getConnection();
try{
    PreparedStatement preparedStatement=connection.prepareStatement(sql);
    preparedStatement.setInt(1,id);

    int row = preparedStatement.executeUpdate();

    if (row > 0) {
        System.out.println("Student deleted");
    } else {
        System.out.println("Student not found");
    }
} catch (SQLException e) {
    throw new RuntimeException(e);
}
   }

}
