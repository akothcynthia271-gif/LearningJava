public class Bank {
    public static void main(String [] args){
        BankAccount account=new BankAccount("Amina",1001,5000);
        account.displayAccountDetails();

        account.deposit(1500);
        account.withdraw(2000);

        System.out.println("\nAfter transactions: ");
        account.displayAccountDetails();

    }
}
