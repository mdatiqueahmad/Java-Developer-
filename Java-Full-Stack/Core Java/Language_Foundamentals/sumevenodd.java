public class sumevenodd {
    public static void main(String[] args) {
        int []arr={1,52,85,1,12,7,62,78};
        int evensum=0;
        int oddsum=0;
        for (int i=0; i<arr.length; i++) {

            if (arr[i] %2==0) {
                evensum+=arr[i];
            }else oddsum+=arr[i];
        }
        System.out.println("Sum of even number : "+evensum);
        System.out.println("Sum of odd number : "+oddsum);
    }
}
