import java.util.*;
public class StudentMain {
    public static void main(String [] args){
        java.util.List<Student>students=new ArrayList<>();

        students.add(new Student("Mary","CS001"));
        students.add(new Student("John","CS002"));
        students.add(new Student("Ann","CS003"));
        students.add(new Student("Peter","CS002"));

        Set<String>registrationNumbers=new HashSet<>();
        registrationNumbers.add("CS001");
        registrationNumbers.add("CS002");
        registrationNumbers.add("CS003");
        registrationNumbers.add("CS001");

        Map<String,Integer>studentMarks=new HashMap<>();

        studentMarks.put("CS001",85);
        studentMarks.put("CS002",75);
        studentMarks.put("CS003",95);
        studentMarks.put("CS004",98);

        Collection<Student>studentRecords=students;

        System.out.println("STUDENT LIST");
        printStudents(studentRecords);

        System.out.println("\nUNIQUE REGISTRATION NUMBERS");
        System.out.println(registrationNumbers);

        System.out.println("\nSTUDENT MARKS");

        for(Student student:students){
            String regNumber=student.getRegistrationNumber();
            int marks=studentMarks.get(regNumber);

            System.out.println(student.getName()+": "+marks);
        }
    }
    public static void printStudents(Collection<Student>students){

        for(Student student:students){
            System.out.println(students);
        }
    }
}
