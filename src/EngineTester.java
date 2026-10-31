public class EngineTester {
    public static void main(String [] args){
        Engine engine=new Engine("combustion","Hz","Volkwagen","VW GOLF 1L 86-91");
        System.out.println(engine.getEngineType());
        System.out.println(engine.getManufacturer());
    }
}
