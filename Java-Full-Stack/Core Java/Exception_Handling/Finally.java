public class Finally {
    public static void main(String[] args) {

        try{

            int res2=48/3;
         //   int res=4/0;
          //  System.out.println(res);
            System.out.println( res2);

        }
        catch (ArithmeticException e){
            System.out.println("Exception handle");
        }

        finally {
            System.out.println("finally executed here..");
        }
    }
}
