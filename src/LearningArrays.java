import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;
public class LearningArrays {
    public static void main(String [] args){
        ArrayList<String>lines=new ArrayList<>();

        try(Scanner scanner=new Scanner(Paths.get("file.txt"))){

            while(scanner.hasNextLine()){
                lines.add(scanner.nextLine());
            }
        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
        System.out.println("Total lines: "+ lines.size());
    }
}
