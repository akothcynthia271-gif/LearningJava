import java.util.ArrayList;
public class Banker {
    private ArrayList<BankAccount>accounts;
    private int nextAccountNumber;

    public Banker(){
        accounts= new ArrayList<>();
        nextAccountNumber=1001;
    }
    public BankAccount createAccount(String accountHolder,double balance){
        if(accountHolder==null || accountHolder.trim().isEmpty()){
            return null;
        }
        if (balance<0){
            return null;
        }
        BankAccount account=new BankAccount(accountHolder,nextAccountNumber,balance);

        accounts.add(account);
        nextAccountNumber++;


        return account;
    }
    public BankAccount findAccount(int accountNumber){
        for(BankAccount account:accounts){
            if(account.getAccountNumber()==accountNumber){
                return account;
            }
        }
        return null;
    }
    public void displayAllAccounts(){
        if(accounts.isEmpty()){
            System.out.println("No accounts have been created");
            return;
        }
        for(BankAccount account:accounts){
            account.displayAccountDetails();
            System.out.println("---------------------------------------");
        }
    }

}
