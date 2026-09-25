import java.util.Scanner;
public class JavaProject {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("write text and press enter:");
        String text = scanner.nextLine();

        System.out.println("you wrote " + text);


    }
}
