public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder,int accountNumber,double balance){
        this.accountHolder= accountHolder;
        this.accountNumber=accountNumber;
        this.balance= balance;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public boolean deposit(double amount){
        if (amount<=0){
            return false;
        }
        balance = balance +amount;
        return true;
    }
    public boolean withdraw(double amount){
        if(amount <=0 || amount>balance){
            return false;
        }
        balance= balance- amount;
        return true;
    }
    public void displayAccountDetails(){
        System.out.println("Account holder: "+ accountHolder);
        System.out.println("Account number: "+ accountNumber);
        System.out.println("Balance: " + balance);
        System.out.printf("Balance: ksh%.2f%n",balance);
    }
}
