import java.util.ArrayList;
public class LambdaExpressions {
    public static void main(String [] args){
        ArrayList<String>names=new ArrayList<>();

        names.add("Mary");
        names.add("John");
        names.add("Cynthia");
        names.add("James");
        names.add("Jane");

        names.stream()
                .filter(name->name.contains("a"))
                .map(name->name.toUpperCase())
                .sorted()
                .forEach(name-> System.out.println(name));
    }
}
