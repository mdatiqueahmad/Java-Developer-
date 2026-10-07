package SetDemo;
import java.util.LinkedHashSet;
public class LinkedHashSet01 {
    public static void main(String[] args) {
        LinkedHashSet<String> courses =new LinkedHashSet<>();
        courses.add("Java");
        courses.add("Spring Boot");
        courses.add("Java");
        courses.add("Kafta");
        courses.add("JDBC");
        courses.add("");

        System.out.println(courses);
    }
}
