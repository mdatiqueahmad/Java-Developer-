package MapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMAp01 {
    public static void main(String[] args) {
        HashMap<Integer, String > std =new HashMap<>();
        std.put(101,"Aman");
        std.put(102,"raman");
        std.put(105,"Aman");
        std.put(104,"saman");
        std.put(103,"Rohman");

        System.out.println(std);

       Set<Integer> integers =std.keySet();
        System.out.println(integers);

        Set<Map.Entry<Integer,String >> entries=std.entrySet();
        System.out.println(entries);

        Iterator<Map.Entry<Integer,String >> it =entries.iterator();
        while ((it.hasNext())){
            Map.Entry<Integer,String > next=it.next();
            System.out.println(next.getKey()+ " ");

            System.out.println(next.getValue()+" ");
        }
    }
}
