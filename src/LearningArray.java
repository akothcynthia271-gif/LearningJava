import java.util.Scanner;
public class LearningArray {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);

        int [] numbers={1,3,5,7,9};

        for(int number:numbers){
            System.out.println(number);
        }
        System.out.println("Give two indices to swap:");
        int index1=Integer.valueOf(scanner.nextLine());
        int index2=Integer.valueOf(scanner.nextLine());

        int temporary=numbers[index1];
        numbers[index1]=numbers[index2];
        numbers[index2]=temporary;

        for(int number:numbers){
            System.out.println(number);
        }

    }
}
