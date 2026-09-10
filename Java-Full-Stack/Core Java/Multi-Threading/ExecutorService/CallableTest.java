package ExecutorService;

import java.util.concurrent.*;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService exectorService= Executors.newSingleThreadExecutor();

       Callable<Integer> task=()->{
           Thread.sleep(3000);
           return 10+20;
       };

        Future<Integer> future=exectorService.submit(task);
        System.out.println(future.get());

        exectorService.shutdown();

    }
}
