package String;

public class StringImmutable {
    public static void main(String[] args) {
        String name="java";
        String s1=name;
        name.concat("Backend");
        String s2=name;
        System.out.println(name);
        System.out.println(s1==s2);
    }
}
