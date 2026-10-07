package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String > li=new ArrayList<>();

        li.add("riya");
        li.add("priya");
        li.add("hariya");
        li.add("kariya");

        ListIterator<String> it= li.listIterator();

        System.out.println("....Forward direction");
        while (it.hasNext()){
            System.out.println("Current Index : "+it.hasNext());
            String data =it.next();

            System.out.println("Value : "+data);
            System.out.println("Previous index : "+it.previousIndex());
            System.out.println();
        }

        System.out.println(".......Backward.....");
        while(it.hasPrevious()){
            System.out.println("Current index : "+it.previousIndex() );
            String data=it.previous();
            System.out.println("Value : "+ data);
            System.out.println("Next Index : "+ it.nextIndex());
            System.out.println();
        }
        System.out.println(li);

        System.out.println("....Set element.....");

        it= li.listIterator();

        while (it.hasNext())
        {
            String data=it.next();

            if (data.equals("riya")){
                it.set("Diya updated");
            }
        }
        System.out.println(li);
    }
}
