package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class multipleHit {
    public static void main(String[] args) {
        ExecutorService exectorService= Executors.newFixedThreadPool(3);

        exectorService.submit(()->System.out.println("order service"));
        exectorService.submit(() -> System.out.println("Payment service"));
        exectorService.submit(()->System.out.println("invoice service"));
    }
}
