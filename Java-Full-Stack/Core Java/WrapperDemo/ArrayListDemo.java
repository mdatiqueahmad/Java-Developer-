import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> nums=new ArrayList<>();

        nums.add(10);
        nums.add(12);

        System.out.println(nums);

        //Unboxing

        Integer a=10;

        Integer obj=Integer.valueOf(1000);
        System.out.println(obj);
        int num=obj.intValue();
        System.out.println(num);


        Integer o1=100;
        int a1=o1; //auto unboxing
        System.out.println(a1);
    }
}
