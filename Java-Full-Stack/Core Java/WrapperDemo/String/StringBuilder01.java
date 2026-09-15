package String;

public class StringBuilder01 {
    public static void main(String[] args) {
        String s1="Raju";
        StringBuilder sb= new StringBuilder("Java");
        sb.append("Backend");
        sb.append("Course demo" );
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        //StringBuilder default capacity:16
        //Formula= old cap *String Length
    }
}
