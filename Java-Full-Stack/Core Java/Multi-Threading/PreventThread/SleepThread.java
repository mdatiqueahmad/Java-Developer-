package PreventThread;

class Mythread extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=5;i++)
        {
            System.out.println("Thread runnig "+i);
            try {
                Thread.sleep(1000);
                System.out.println("Sleep for 1 sec ");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class SleepThread  {
    public static void main(String[] args) {
        Mythread t1=new Mythread();
        t1.start();

        System.out.println("Main Thread");
    }
}
