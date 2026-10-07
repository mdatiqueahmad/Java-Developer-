package ListDemo;

import java.util.LinkedList;
import java.util.List;

public class ListP03 {
    public static void main(String[] args) {
        LinkedList<String > li=new LinkedList<>();
        li.add("A1");
        li.add("A2");
        li.add("A3");
        li.add("");
        li.add("A4");
        li.add("A5");
        li.add("A4");
        li.add("A5");
        System.out.println(li);
        System.out.println(li.getFirst());
        System.out.println(li.get(1));
        System.out.println(li.removeFirst());
        System.out.println(li.remove(2));
    }
}
