import java.util.Scanner;
public class ArraySearch {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int [] numbers={1,2,4,6,8,7};
        System.out.println("Search for?");
        int search=Integer.valueOf(scanner.nextLine());

        Boolean found=false;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==search){
                System.out.println(search+ " is at index" + i +".");
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println(search + " was not found");
        }
    }
}
