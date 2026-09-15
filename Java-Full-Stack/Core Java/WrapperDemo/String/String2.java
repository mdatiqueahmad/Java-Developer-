package String;

public class String2 {
    public static void main(String[] args) {
        String s1="Java Backend";

        System.out.println(s1.length());
        System.out.println(s1.trim());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.contains("Back"));
        System.out.println(s1.startsWith("Java"));
        System.out.println(s1.endsWith(" "));

        String names="Rahul, priya, Amit";
        String  namesArray[]=names.split(",");
            for (String name : namesArray) {
                System.out.println(name);

        }

            String mobile="7894569874";
            String lastfour=mobile.substring(6);
        System.out.println(lastfour);
        String  res=mobile.substring(2,6);
        System.out.println(res);
    }
}
