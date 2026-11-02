import java.lang.Override;

public class SavingsAccount extends BankAccountBalance {

    @Override
    public double calculateInterest() {
        return balance*0.05;
    }
}
