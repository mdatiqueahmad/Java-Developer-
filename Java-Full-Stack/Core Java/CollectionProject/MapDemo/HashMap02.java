package MapDemo;

import java.beans.Introspector;
import java.util.HashMap;
import java.util.Map;

public class HashMap02 {
    public static void main(String[] args) {
        Map<Integer ,String > map= new HashMap<>();
        map.put(101,"Rahul");
        map.put(12,"Amit");
        map.put(103,"Neha");
        map.put(109,"Sneha");

        for (Map.Entry<Integer,String > entry:map.entrySet())
        {
            System.out.println("Key: "+ entry.getKey());
            System.out.println("Value : "+ entry.getValue());
        }

        System.out.println("....only key......");
        for (Integer key: map.keySet()) {
            System.out.println(key + " -->" + map.get(key));
        }
        System.out.println();
        map.forEach((k,v)->{
            System.out.println("Key : "+k + " value : "+v);
        });

        if (!map.containsKey("103"))
        {
            map.put(104,"Hariya");
        }

        map.computeIfAbsent(105,k->"Hira");
        System.out.println(map);
    }
}
