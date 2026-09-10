import java.util.SortedMap;

public class Stringconversion {
    public static void main(String[] args) {

        String ageText="22";

        String priceText="99.6";
        String activeText="True";

        int age=Integer.parseInt(ageText);
        double price=Double.parseDouble(priceText);
        boolean active= Boolean.parseBoolean(activeText);

        System.out.println(active);
        System.out.println(age);
        System.out.println(price);
    }
}
