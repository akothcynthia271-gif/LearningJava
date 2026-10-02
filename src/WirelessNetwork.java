import java.util.ArrayList;
import java.util.Scanner;
public class WirelessNetwork {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer>Wordlist=new ArrayList<>();

        while(true){
            int value=Integer.valueOf(scanner.nextLine());

            if (value==-1){
                break;
            }
            Wordlist.add(value);
        }
        System.out.println("From where?");
        int start=Integer.valueOf(scanner.nextLine());
        System.out.println("to where?");
        int end=Integer.valueOf(scanner.nextLine());

        for(int i= start;i<=end;i++){
            System.out.println(Wordlist.get(i));
        }

    }
}
