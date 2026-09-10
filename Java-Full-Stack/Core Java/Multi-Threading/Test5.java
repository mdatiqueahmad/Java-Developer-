class MyThread extends  Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()+ "child");
        System.out.println("Running...");
    }
}

public class Test5 {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        System.out.println(Thread.currentThread().getName());
        t1.start();
        //t1.start();// one thread can be start only once
    }
}
