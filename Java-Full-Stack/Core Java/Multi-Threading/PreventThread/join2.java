package PreventThread;

public class join2 {
    public static void main(String[] args) throws InterruptedException {
        DownloadFiles d1=new DownloadFiles();
        d1.start();

//        Thread.sleep(3000);
//        d1.interrupt();

        d1.join();
        System.out.println("Let me open a File....");
    }
}

class DownloadFiles extends Thread{
    @Override
    public void run() {
        for (int i=0; i<5;i++)
        {
            System.out.println("Download Files ...."+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}