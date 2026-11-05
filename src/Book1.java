import java.lang.Override;

public class Book1 implements Comparable <Book1>{
    private String title;
    private int price;

    public Book1(String title,int price){
        this.title=title;
        this.price=price;
    }
    @Override
    public int compareTo(Book1 other){
        return Integer.compare(other.price,this.price);
    }
    @Override
    public String toString(){
        return title +"-"+ price;
    }
}