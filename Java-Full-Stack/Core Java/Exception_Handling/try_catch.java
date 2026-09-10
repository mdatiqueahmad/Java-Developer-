public class try_catch {
    public static void main(String[] args) {
        try{
            int res = 10/0;
        }
        catch (ArithmeticException e){
            System.out.println("invalid division");
            e.printStackTrace();
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }
        System.out.println("program completed....");
    }
}
