public class MainProgram1 {
    public static void main(String [] args){
        PhoneBook petesCard=new PhoneBook(6);

        System.out.println("Money:"+petesCard.balance());
        boolean wasSuccessful=petesCard.takeMoney(8);
        System.out.println("successfully took:"+ wasSuccessful);
        System.out.println("Money "+ petesCard.balance());
    }
}
