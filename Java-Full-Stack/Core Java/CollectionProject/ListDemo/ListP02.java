package ListDemo;

import java.util.ArrayList;
import java.util.List;

public class ListP02 {
    public static void main(String[] args) {

        List<String> student=new ArrayList<>();
        student.add("Aman");
        student.add("Riya");
        student.add("karan");

        System.out.println(student);
        student.add(1,"Neha");
        System.out.println(student.get(2));

        student.set(2, "rahul");

        student.remove("Aman");

        System.out.println(student);
    }
}
