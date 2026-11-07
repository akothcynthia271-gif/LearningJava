import java.util.Scanner;
public class Add2 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first number: ");
        int num1=Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the second number: ");
        int num2=Integer.parseInt(scanner.nextLine());

        int sum=num1+num2;
        System.out.println("The sum of the two number is:"+ sum);

    }
}
