package LockFramework;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counters {
    int count = 0;

    Lock lock=new ReentrantLock();

    void increment() {
        lock.lock();
        try {
            System.out.println("incrementing count....");
            count++;
        }
            finally {
            lock.unlock();
        }

    }
}
class CounterTests extends Thread{

    Counters counters;

    CounterTests(Counters counters){
        this.counters=counters;
    }
    @Override
    public void run() {
        for (int i=1;i<=10;i++)
        {
            counters.increment();
        }
    }
}

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Counters counters=new Counters();

        CounterTests t1=new CounterTests(counters);
        CounterTests t2=new CounterTests(counters);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counters.count);
    }
}