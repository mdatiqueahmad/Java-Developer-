package SetDemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> marks=new TreeSet<>();

        marks.add(80);
        marks.add(00);
        marks.add(10);
        marks.add(580);
        marks.add(840);
        marks.add(00);
        marks.add(840);
        System.out.println(marks);

        Set<String > names=new TreeSet<>();
        names.add("Zorawar");
        names.add("");
        names.add("Abhay");
        names.add("Abhishek");
        names.add("Abhiram");
        System.out.println(names);

        TreeSet<Integer> salary=new TreeSet<>();
        salary.add(50000);
        salary.add(40000);
        salary.add(60000);
        salary.add(90000);
        salary.add(78000);

        System.out.println(salary.lower(78000));//Strictly less than x
        System.out.println(salary.floor(70000));//less than or equal to x
        System.out.println(salary.higher(70000));//Strictly grater than x
        System.out.println(salary.ceiling(70000));//greater than or equal to x


        TreeSet t= new TreeSet();
        t.add("k");
        t.add("K");
        t.add("Z");
        t.add("A");
        t.add("A");
        t.add("T");

        System.out.println(t);



    }
}
