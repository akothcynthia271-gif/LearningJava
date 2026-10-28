import java.util.Scanner;
public class Bank {
    public static void main(String [] args){
       Scanner scanner= new Scanner(System.in);
       Banker banker=new Banker();

       boolean running=true;

       while(running){
           displayMenu();

           System.out.println("Choose an option: ");
           String choice=scanner.nextLine();

           switch(choice){
               case "1":
                   createAccount(scanner,banker);
                   break;
               case"2":
                   depositMoney(scanner,banker);
                   break;
               case"3":
                   withdrawMoney(scanner,banker);
                   break;
               case"4":
                   checkBalance(scanner,banker);
                   break;
               case"5":
                   banker.displayAllAccounts();
                   break;
               case "6":
                   running = false;
                   System.out.println("Thank you for using our bank");
                   break;
               default:
                   System.out.println("Invalid choice. please try again");
           }
           System.out.println();
       }
       scanner.close();
    }
    public static void displayMenu(){
        System.out.println("==== COMMANDLINE BANKING APP ====");
        System.out.println("1.Create account");
        System.out.println("2.Deposit money");
        System.out.println("3.Withdraw money");
        System.out.println("4.Check balance");
        System.out.println("5.View all accounts");
        System.out.println("6. Exit");
    }
    public static void createAccount(Scanner scanner,Banker banker){
        System.out.println("Enter accountholder's name");
        String name=scanner.nextLine();

        System.out.println("Enter initial deposit(Ksh): ");

        try{
            double amount=Double.parseDouble(scanner.nextLine());
            BankAccount account=banker.createAccount(name,amount);
            if(account!=null){
                System.out.println("Account created successfully");
                System.out.println("Your account number is "+ account.getAccountNumber());
            }else{
                System.out.println("Account could not be created. "+ "Check the name and initial deposit");
            }
        }catch(NumberFormatException e){
            System.out.println("Invalid amount. Please enter a number.");
        }
    }
    public static void depositMoney(Scanner scanner,Banker banker){
        System.out.println("Enter account number: ");

        try{
            int accountNumber=Integer.parseInt(scanner.nextLine());
            BankAccount account=banker.findAccount(accountNumber);

            if(account==null){
                System.out.println("Account not found.");
                return;
            }
            System.out.println("Enter deposit amount (Ksh): ");
            double amount=Double.parseDouble(scanner.nextLine());

            if(account.deposit(amount)){
                System.out.println("Deposit successful!");
                System.out.printf("New balance: Ksh%.2f%n" ,account.getBalance());
            }else{
                System.out.println("Deposit failed. Amount must be positive");
            }
        }catch(NumberFormatException e){
            System.out.println("Invalid input. Enter a valid number");
        }
    }
    public static void withdrawMoney(Scanner scanner,Banker banker){
        System.out.println("Enter account number: ");

        try{
            int accountNumber=Integer.parseInt(scanner.nextLine());
            BankAccount account=banker.findAccount(accountNumber);

            if(account==null){
                System.out.println("Account not found");
                return;
            }
            System.out.println("Enter withdrawal amount(Ksh): ");
            double amount=Double.parseDouble(scanner.nextLine());
            if(account.withdraw(amount)){
                System.out.println("Withdrawal successful");
                System.out.printf("Remaining balance. Ksh%.2f%n",account.getBalance());
            }else{
                System.out.println("Withdrawal failed. Check the amount "+"and the available balance");
            }
        }catch(NumberFormatException e){
            System.out.println("Invalid input. Enter a valid number");
        }
    }
    public static void checkBalance(Scanner scanner,Banker banker){
        System.out.println("Enter account number: ");

        try{
            int accountNumber=Integer.parseInt(scanner.nextLine());
            BankAccount account=banker.findAccount(accountNumber);

            if(account==null){
                System.out.println("Account not found");
            }else{
                account.displayAccountDetails();
            }
        }catch(NumberFormatException e){
            System.out.println("Invalid account number");
        }
    }
}
