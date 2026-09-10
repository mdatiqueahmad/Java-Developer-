package Interface;

public interface payment {
    int a=500;
    void pay();

}

class UPiPayment implements payment{
            @Override
    public void pay(){
                System.out.println("payment done");

    }
}
