package SetDemo;

import java.util.HashSet;
import java.util.Set;

public class SetP01 {
    public static void main(String[] args) {
        Set<String> emails= new HashSet<>();
        emails.add("adas@");
        emails.add("adas@");//interesting
        emails.add("wqere@");
        emails.add("pk9@");

        System.out.println(emails);
        System.out.println(emails.size())
        ;
     }
}
