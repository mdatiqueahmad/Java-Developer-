import java.util.Scanner;

public class indexfind {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int []arr= {484,1,6,1,15,53};
        System.out.print("Enter number to find: ");
        int input = sc.nextInt();
        boolean found = false;

        for (int i = 0 ; i<arr.length;i++) {
           if(arr[i] == input){
               System.out.println("Element is found at: " +i);
               found = true;
               break;
           }
        }
        if (!found){
            System.out.println("not found");
        }
        sc.close();
    }
}
