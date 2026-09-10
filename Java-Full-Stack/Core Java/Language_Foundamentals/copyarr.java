public class copyarr {
    public static void main(String[] args) {

       int [] arr = {4,5,4,8,41};
       int []copy = new int[arr.length];

       for (int i=0; i<arr.length;i++){
           copy[i] =arr[i];
       }

        System.out.print("Original array: ");
       for (int arr1:arr){
           System.out.print(arr1);
       }
        System.out.println();
        System.out.println("copy array : ");
       for (int copy1: copy){
           System.out.print(copy1);
       }
    }
}
