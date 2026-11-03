public class Student {
    private String name;
    private String registrationNumber;

    public Student(String name,String registrationNumber){
        this.name=name;
        this.registrationNumber=registrationNumber;
    }
    public String getName(){
        return name;
    }
    public String getRegistrationNumber(){
        return registrationNumber;
    }
    public String toString(){
        return name +" ("+ registrationNumber+ " )";
    }
}
