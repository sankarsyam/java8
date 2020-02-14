import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class  Student{
    String name;
    int marks;
    Student(String name,int marks){
        this.name = name;
        this.marks = marks;
    }
}
public class FunctionSampleStudentGrade {

    public static void populate(ArrayList<Student> list){
        list.add(new Student("Sabu",50));
        list.add(new Student("Mon",80));
        list.add(new Student("Kukku",30));
        list.add(new Student("Makku",20));
        list.add(new Student("Cheeru",70));
    }
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<Student>();
        populate(list);
        Function<Student, String> fun = student -> {
            if (student.marks >= 80){
                return "Distinction";
            }else if(student.marks >= 60) {
                return "First Class";
            }else if(student.marks >= 50) {
                return "Second Class";
            }else if(student.marks >= 35) {
                return "First Class";
            }else{
                return "fail";
            }
        };
        for (Student student :list) {
            System.out.println("**************************");
            System.out.println("Name :" + student.name);
            System.out.println("Marks :" + student.marks);
            System.out.println("Grade :" + fun.apply(student));
        }
    }
}
