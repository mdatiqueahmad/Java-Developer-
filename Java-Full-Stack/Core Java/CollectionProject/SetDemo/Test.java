package SetDemo;

import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        TreeSet<Student01> student= new TreeSet<>();
        System.out.println("Added Rahul");
        student.add(new Student01(10,"Rahul"));
        System.out.println();

        System.out.println("Added Amit");
        student.add(new Student01(60,"Amit"));
        System.out.println();

        System.out.println("Added Rahul");
        student.add(new Student01(5,"Rahul"));
        System.out.println();

        System.out.println("Added Karan");
        student.add(new Student01(24,"Karan"));

        System.out.println("Added Amit");
        student.add(new Student01(20,"Amit"));
        System.out.println();

        System.out.println(student);
    }
}
