import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

       // List list = new ArrayList(); this is bad practice so we use generic
        List<Integer> list = new ArrayList();
        list.add(10);
       // list.add(true);
       // list.add("Atique");
        list.add(10);

        System.out.println(list);
    }
}
