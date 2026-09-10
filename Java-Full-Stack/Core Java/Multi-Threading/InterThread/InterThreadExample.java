package InterThread;

public class InterThreadExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1=new MyThread();
        t1.start();
        System.out.println("main thread calling wait() ");
        synchronized (t1){
            t1.wait();
        }
        System.out.println("main thread got notification");
    }
}

class MyThread extends Thread{

    int total=0;

    @Override
    public void run() {
        synchronized (this)
        {
            System.out.println("Child thred start calculation");
            for (int i = 0; i < 100; i++) {
                total=total+1;
            }

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("child thread giving notification");
            this.notify();
        }
    }
}
