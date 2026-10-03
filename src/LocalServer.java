import java.util.Scanner;
public class LocalServer {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the username:");
        String username=scanner.nextLine();

        System.out.println("Enter the password:");
        String password=scanner.nextLine();

        if(username.equals("Alex")&& password.equals("sunshine")){
            System.out.println("You have successfully logged in");
        }
        else if(username.equals("emma")&& password.equals("Haskell")){
            System.out.println("you have successfully logged in");
        }else{
            System.out.println("Incorrect password or username");
        }
    }
}
