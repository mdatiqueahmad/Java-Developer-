package org.cfs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        StudentService service=new StudentService();
        int choice;

        do{
            System.out.println();
            System.out.println("=== Student management system");

            System.out.println("1. Add Student");
            System.out.println("2. View all Student");
            System.out.println("3. Search Student");
            System.out.println("4. Update student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.println("Enter your choice: ");

            choice=scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Enter student id: ");
                    int id =scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter student name: ");
                    String name=scanner.nextLine();

                    System.out.println("Enter student email: ");
                    String email=scanner.nextLine();

                    System.out.println("Enter student course: ");
                    String course=scanner.nextLine();

                    System.out.println("Enter student marks: ");
                    double marks=scanner.nextDouble();


                    Student student=new Student(id, name, email,course,marks);
                    service.addStudent(student);
                    break;



                case 2:
                    service.viewALlStudent();
                    break;



                case 3:
                    System.out.println("Enter student id: ");
                    int newId =scanner.nextInt();
                    scanner.nextLine();
                    service.searchStudent(newId);
                    break;




                case 4:
                    System.out.print("Enter student ID to update: ");
                    int id2 = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter new name: ");
                    String name2 = scanner.nextLine();

                    System.out.print("Enter new email: ");
                    String email2 = scanner.nextLine();

                    System.out.print("Enter new course: ");
                    String course2 = scanner.nextLine();

                    System.out.print("Enter new marks: ");
                    double marks2 = scanner.nextDouble();

                    Student student2 = new Student(id2, name2, email2, course2, marks2);

                    service.updateStudent(student2);
                    break;

                case 5:
                    System.out.println("Enter Id to be Deleted: ");
                    int delId=scanner.nextInt();
                    service.deleteStudent(delId);

                case 6:
                    System.out.println("Application closed. ");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (choice!=0);
            scanner.close();
    }
}
