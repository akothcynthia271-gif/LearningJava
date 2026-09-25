import java.util.Scanner;
public class Exercise {
    public static void main(String [] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("write a value:");
        int value = Integer.valueOf(scanner.nextLine());
        System.out.println("you wrote: " + value);
    }
}
