package String;

public class SCP {
    public static void main(String[] args) {
        String s1="java";
        String s2="java";
        String s3=new String("java");
        String s4=new String("java");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
    }
}
