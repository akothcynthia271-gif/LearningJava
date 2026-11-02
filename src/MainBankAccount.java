public class MainBankAccount {
    public static void main(String [] args){
        SavingsAccount savings=new SavingsAccount();
        savings.deposit(10000);

        CurrentAccount current=new CurrentAccount();
        current.deposit(10000);

        System.out.println(savings.calculateInterest());
        System.out.println(current.calculateInterest());
    }
}
