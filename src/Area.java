import java.util.Scanner;
public class Area{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int length=Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the width of the rectangle: ");
        int width=Integer.parseInt(scanner.nextLine());

        int area=length*width;
        System.out.println("The area of the rectangle is: "+area);
    }

}
