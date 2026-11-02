import java.lang.Override;

public class CurrentAccount extends BankAccountBalance {

    @Override
    public double calculateInterest() {
        return balance*0.02;
    }
}
