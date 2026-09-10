package customException;

public class productservice {
    void findProduct(int productId)
    {
        if(productId!=101)
        {
            //exception
            throw new ProductNotfoundException("Product not found");
        }
        System.out.println("Product found");
    }
}
