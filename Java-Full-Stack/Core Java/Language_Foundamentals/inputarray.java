import java.util.Scanner;

public class inputarray {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int []marks=new int[5];
        for (int i=0 ;i<marks.length;i++) {
            System.out.println("Enter the marks for student: " + (i+1)+ ":");
            marks[i]=sc.nextInt();
        }
        System.out.println("Enter marks:");
        for (int mark:marks) {
            System.out.print(mark);
        }
        sc.close();
    }
}
