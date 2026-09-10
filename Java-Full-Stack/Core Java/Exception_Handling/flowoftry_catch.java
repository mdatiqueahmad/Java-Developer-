public class flowoftry_catch {
    public static void main(String[] args) {

        try {
            System.out.println("line 1");
            System.out.println(10/0);
            System.out.println("Line 2");
        }
        catch (ArithmeticException e){
            System.out.println("Exception Handled..");
        }
        System.out.println("Line 3");
    }
}
