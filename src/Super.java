public class Super {
    public static void main(String [] args){
        Payment payment1=new Mpesa();
        Payment payment2=new CreditCard();

        payment1.pay(500);
        payment2.pay(1000);

    }
}
