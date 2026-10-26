import java.util.Scanner;
public class CalculatorTester {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        CommandlineCalculator calculator=new CommandlineCalculator();

        boolean running= true;
        System.out.println("=== JAVA COMMANDLINE CALCULATOR ===");

        while(running){
            System.out.println("\nChoose an operation: ");
            System.out.println("1.Addition(+)");
            System.out.println("2.Subtraction(-)");
            System.out.println("3.Multiplication(*)");
            System.out.println("4.Division(/)");
            System.out.println("5.Exit");
            System.out.println("Your choice: ");

            String choice=scanner.nextLine();

            if(choice.equals("5")){
                running=false;
                System.out.println("calculator closed. Goodbye!");
                continue;
            }
            if(!choice.equals("1")
               && !choice.equals("2")
               && !choice.equals("3")
               && !choice.equals("4") ){
               System.out.println("Invalid choice. Please try again");
                continue;
            }
            double firstNumber= readNumber(scanner, "Enter the first number");
            double secondNumber=readNumber(scanner, "Enter the second number");

            try{
                switch(choice){
                    case "1":
                        System.out.println("Result:" + calculator.add(firstNumber,secondNumber));
                        break;
                    case "2":
                        System.out.println("Result: "+ calculator.subtract(firstNumber, secondNumber));
                        break;
                    case "3":
                        System.out.println("Result:"+ calculator.multiply(firstNumber, secondNumber));
                        break;
                    case "4":
                        System.out.println("Result: " + calculator.divide(firstNumber,secondNumber));
                }
            }catch(IllegalArgumentException e){
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
    public static double readNumber(Scanner scanner,String message){
        while(true){
            System.out.println(message);
            String input=scanner.nextLine();

            try{
                return Double.parseDouble(input);
            }catch(NumberFormatException e){
                System.out.println("Invalid number. please enter a number such as 12 or 3.5");
            }
        }
    }
}
