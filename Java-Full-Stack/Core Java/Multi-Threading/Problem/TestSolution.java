package Problem;

class Counters {
    int count = 0;

/*  synchronized */ void increment() {
       synchronized (this)
       {
           count++;
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
        for (int i=1;i<=1000;i++)
        {
            counters.increment();
        }
    }
}

public class TestSolution {
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
