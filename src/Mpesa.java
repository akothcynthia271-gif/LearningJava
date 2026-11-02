import java.lang.Override;

public class Mpesa implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("paid "+amount+" using MPESA");
    }
}
