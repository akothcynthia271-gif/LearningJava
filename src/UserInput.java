import java.util.ArrayList;
import java.util.Scanner;
public class UserInput {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        ArrayList<String>List=new ArrayList<>();

        while(true){
            String word=scanner.nextLine();

            if (word.isEmpty()){
                break;
            }
            List.add(word);
        }
        System.out.println("In total:"+ List.size());

    }
}
