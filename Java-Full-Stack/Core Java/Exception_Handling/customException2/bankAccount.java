package customException2;

public class bankAccount {
    double balance=5000;

//    void Withdraw(double amount){
//        if (amount>balance){
//            try {
//                throw new insufficentBalanceException("Not enough amount");
//            }catch (insufficentBalanceException e){
//                System.out.println(" your balance lower than : " + amount);
//            }
//            finally {
//                System.out.println("transaction closed");
//            }
//        }
//        else {
//            balance-=amount;
//            System.out.println(" remeaning amount:"+ amount);
//            System.out.println("Withdraw successfull");
//        }
//
//    }

void Withdraw(double amount) throws insufficentBalanceException{
    if (amount>balance){
            throw new insufficentBalanceException("Not enough amount");
    }
    else {
        balance-=amount;
        System.out.println(" remeaning amount:"+ amount);
        System.out.println("Withdraw successfull");
    }

}
}
