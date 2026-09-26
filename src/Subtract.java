import java.util.Scanner;
public class Subtract {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = Integer.valueOf(scanner.nextLine());

        if (number>0) {
            System.out.println("The number is positive");
        }
        if (number<0){
                System.out.println("The number is not positive");
            }

    }
}
