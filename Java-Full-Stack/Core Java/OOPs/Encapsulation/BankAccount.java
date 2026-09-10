package Encapsulation;

public class BankAccount {
    private double balance;
    void deposite(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
        }
    }
    public double getBalance() {
        return balance;
    }
}
