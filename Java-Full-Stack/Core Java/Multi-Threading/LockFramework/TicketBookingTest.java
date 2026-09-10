package LockFramework;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TicketBooking {
    int availableSeats=1;
    Lock lock=new ReentrantLock();

    void bookTicket(String username)
    {
        boolean locked=lock.tryLock();
        if(locked)
        {
            try {
                if (availableSeats>0)
                {
                    System.out.println(username+ " is booking ticket ");
                    Thread.sleep(5000);
                    availableSeats--;
                    System.out.println(username+" Booking successfull ");
                }
                else {
                    System.out.println(username + " No seat available");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }

        else {
            System.out.println(username+ " could not get lock , try again ");
            System.out.println(username +" ok let me do something else");
        }
    }

}

class TicketThread extends Thread{
    TicketBooking ticketBooking;
    String username;
    TicketThread(TicketBooking ticketBooking, String username)
    {
        this.ticketBooking=ticketBooking;
        this.username=username;
    }

    @Override
    public void run() {
        ticketBooking.bookTicket(username);
    }
}

public class TicketBookingTest {
    public static void main(String[] args) {

        TicketBooking ticketBooking=new TicketBooking();

        TicketThread t1=new TicketThread(ticketBooking,"Atique");
        TicketThread t2=new TicketThread(ticketBooking , "vish");

        t1.start();
        t2.start();

    }
}
