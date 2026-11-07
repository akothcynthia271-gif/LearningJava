import java.util.Scanner;
public class Program2 {
    public static void main(String [] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your name: ");
        String name=scanner.nextLine();

        System.out.println("Enter your age: ");
        int age=Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your city: ");
        String city=scanner.nextLine();
        System.out.println("Enter your favourite programming language: ");
        String language=scanner.nextLine();
        System.out.println("Enter your university course: ");
        String course=scanner.nextLine();


        System.out.println("\n.......User details..........");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("City: "+city);
        System.out.println("Favourite programming language: "+language);
        System.out.println("University course: "+course);

        scanner.close();

    }
}
