package polymorphism;

class Payment{
    void pay()
    {
        System.out.println("generic payment");
    }
}

class upipayment extends Payment {
    @Override
    void pay() {
        System.out.println("payment done using upi");
    }

}
public class overiding {
    public static void main(String[] args) {
        Payment payment=new Payment();
        payment.pay();

        System.out.println(".........................");

        upipayment upip=new upipayment();
        upip.pay();
    }
}
