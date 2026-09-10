class MyRunnable implements Runnable{
    @Override
    public void run() {
      Thread thread=Thread.currentThread();
        System.out.println("Thread : "+thread.getName()+ " Priority "+thread.getPriority() );
    }
}


public class Prioritycheck {
    public static void main(String[] args) {
        Thread thread=Thread.currentThread();
        System.out.println("Thread : "+thread.getName()+ " Priority "+thread.getPriority() );
        Thread t1= new Thread(new MyRunnable(), "Thread-1");
        Thread t2= new Thread(new MyRunnable(), "Thread-2");
t1.start();
t2.start();
    }
}
