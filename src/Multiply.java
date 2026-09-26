import java.util.Scanner;
public class Multiply {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");

        int number=Integer.valueOf(scanner.nextLine());
        if (number>120){
            System.out.println("Speeding ticket!");
        }

    }
}
