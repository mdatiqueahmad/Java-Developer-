package privateDemo;

public class BankAccount {

    private double balance;

    void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
    }
    double getBalance ()
    {
        return balance;
    }

}
