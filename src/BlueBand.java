import java.util.ArrayList;
import java.util.Scanner;
public class BlueBand {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer>List=new ArrayList<>();

        while(true){
            int number=Integer.valueOf(scanner.nextLine());
            if (number==-1){
                break;
            }
            List.add(number);
        }
        for(int number:List){
            System.out.println(number);
        }
    }
}
