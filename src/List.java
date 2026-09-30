import java.util.ArrayList;
import java.util.Scanner;
public class List {
    public static void main(String [] args){
        Scanner scanner= new Scanner(System.in);
        ArrayList<Integer>List=new ArrayList<>();

        while(true){
            int input=Integer.valueOf(scanner.nextLine());

            if (input==0){
                break;
            }
            List.add(input);

        }
        System.out.println(List.get(1)+List.get(2));

    }
}
