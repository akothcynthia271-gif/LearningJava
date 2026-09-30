import java.util.ArrayList;
import java.util.Scanner;
public class Array {
    public static void main (String [] args){
        Scanner scanner= new Scanner(System.in);
        ArrayList<String>List=new ArrayList<>();

        while(true){
            String input=scanner.nextLine();

            if(input.equals("")){
                break;
            }
            List.add(input);
        }
        System.out.println(List.get(2));
    }
}
