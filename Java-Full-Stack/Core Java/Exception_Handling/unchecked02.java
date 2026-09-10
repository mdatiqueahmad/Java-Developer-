import java.util.InputMismatchException;
import java.util.Scanner;

public class unchecked02 {
    public static void main(String[] args) {

        try {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the Number ");
            int age= sc.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Input mismatched");
        }
    }
}
