public class StringDemo {

    public static void main(String[] args) {

        String ageText="21";

        int age=Integer.parseInt(ageText);

        System.out.println(age);

        //Creating object

        Integer num=new Integer(10);
        System.out.println(num);
        //Here you are explicitly creating an Integer object containing 10.
        //However, in modern Java, new Integer(10) is deprecated. Prefer:
        Integer number=Integer.valueOf(100);
        //now the perfect one
        Integer n1=100;

        Integer n2=100;
        Double price=99.15;
        Character grade='A';

    }
}
