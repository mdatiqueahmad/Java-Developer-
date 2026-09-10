package ExecutorService;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//here we use java 8

public class Test {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <=6 ; i++) {
            int taskNum=i;

            executor.submit(
                    ()->{
                        System.out.println("Task "+ taskNum+ " Executed by "+ Thread.currentThread().getName());
                    }
            );

        }
        executor.shutdown();
    }
}
