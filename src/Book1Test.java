import java.util.ArrayList;
import java.util.Collections;
public class Book1Test {
    public static void main(String [] args){
        ArrayList<Book1>books=new ArrayList<>();

        books.add(new Book1("JAVA BASICS",1500));
        books.add(new Book1("PYThON BASIC",1000));
        books.add(new Book1("C++ BASICS",2000));

        Collections.sort(books);

        for(Book1 book:books){
            System.out.println(book);
        }
    }
}
