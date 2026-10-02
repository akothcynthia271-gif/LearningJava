import java.util.ArrayList;
import java.util.Scanner;
public class ReadInput {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        ArrayList<String>WordList=new ArrayList<>();


        while(true){
            String word=scanner.nextLine();
            if(word.isEmpty()){
                break;
            }
            WordList.add(word);
        }
        System.out.println(WordList.get(WordList.size()-1));
    }
}
