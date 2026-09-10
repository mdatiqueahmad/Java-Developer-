import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter your input");
        int input = sc.nextInt();
        System.out.println();
        System.out.println(input);
    }
}
