package protectedDemo;

import other.privatechild;

public class protectedTest {
    public static void main(String[] args) {
        privatechild e1 =new privatechild();
        System.out.println(e1.salary);
        e1.salary=5022;
        System.out.println(e1.salary);
    }
}
