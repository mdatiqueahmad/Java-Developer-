package customException;

public class Test {
    public static void main(String[] args) {
        productservice service=new productservice();
        try {
            service.findProduct(105);
        }catch (ProductNotfoundException e)
        {
            System.out.println(e.getMessage());

        }
        }
    }

