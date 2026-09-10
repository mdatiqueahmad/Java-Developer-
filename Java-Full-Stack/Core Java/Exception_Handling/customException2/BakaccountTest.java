package customException2;

public class BakaccountTest {
    public static void main(String[] args) /* throws  insufficentBalanceException */{

        bankAccount account=new bankAccount();

       try {
           account.Withdraw(7000);
       }
        catch (insufficentBalanceException e )
        {
            System.out.println("insufficient balance");
            System.out.println(e.getMessage());
        }
    }
}
