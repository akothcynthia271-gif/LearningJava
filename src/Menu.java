public class Menu {
    public static void main(String [] args){
        Developer developer=new Developer();

        developer.addMeal("omena");
        developer.addMeal("ugali");
        developer.addMeal("Fish");
        developer.addMeal("meat");
        developer.addMeal("chicken");

        developer.printMeals();
        developer.clearMenu();

        System.out.println();

        developer.addMeal("tomato and mozzarella salad");
        developer.addMeal("pizza");
        developer.addMeal("smashed potato");
        developer.printMeals();

    }
}
