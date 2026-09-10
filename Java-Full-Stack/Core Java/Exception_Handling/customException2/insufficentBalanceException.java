package customException2;

public class insufficentBalanceException extends Exception{
    insufficentBalanceException(String msg){
        super(msg);
    }
}
