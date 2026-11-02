public abstract class BankAccountBalance {
    double balance;

    public void deposit(double amount){
        balance=balance+ amount;
    }
    public abstract double calculateInterest();
}
