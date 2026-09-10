package ExecutorService;

// here we did not use java 8

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class EmailTask implements Runnable{
    String studentEmail;
    EmailTask(String studentEmail)
    {
        this.studentEmail=studentEmail;
    }

    @Override
    public void run() {
        System.out.println("Sending email to " + studentEmail + " by"+ Thread.currentThread().getName());

    }
}

public class Test2 {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(3);

        String[] email={
                "atique@gmail.com",
                "su@gmail.com",
                "aditi@gmail.com",
                "suryansh@gmail.com",
                "aditya@gmail.com",
                "nikita@gmail.com",
        };

        for (String e:email)
        {
            executorService.submit(new EmailTask(e));
        }
        executorService.shutdown();
    }
}
