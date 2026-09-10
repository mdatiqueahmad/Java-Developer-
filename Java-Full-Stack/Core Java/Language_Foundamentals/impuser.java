import java.util.Scanner;

public class impuser {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the name: ");
        String name= sc.next();

        System.out.println(name);
        sc.nextLine(); //like ths
        System.out.println("Second Name: ");
        String name2 =sc.nextLine();
        System.out.println(name2);
        // how to solve this use extra sc.nextLine();

    }
}
