package Encapsulation;

public class Text {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();

        bankAccount.deposite(5000);
        System.out.println(bankAccount.getBalance());
    }
}
