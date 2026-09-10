public class question1 {
    static int test()
    {
        try{
            System.out.println("try");
            int r=10/0;
            //return 10;
        } catch (Exception e){
            System.out.println("catch");
            return 20;
        }
        finally {
            System.out.println("finally");
            return 30;
            // return 30 not 20 because Java prepares to return 20, but before actually returning, it must execute finally.This overrides the pending return 20.
        }
       // return 40; //unrechable code
    }

    public static void main(String[] args) {
        int res=test();
        System.out.println("Result : "+ res);
    }
}
