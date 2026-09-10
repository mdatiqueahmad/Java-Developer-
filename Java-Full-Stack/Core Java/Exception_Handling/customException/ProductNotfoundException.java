package customException;

public class ProductNotfoundException extends RuntimeException{
    ProductNotfoundException(String msg)
    {
        super(msg);
    }
}
