import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
    String name;
    int marks;
    Student(String name,int marks){
        this.name = name;
        this.marks = marks;
    }
}

public class ConsumerPredicateFun {
    public static void populate(ArrayList<Student> list){
        list.add(new Student("Student1",20));
        list.add(new Student("Student2",40));
        list.add(new Student("Student3",50));
        list.add(new Student("Student4",60));
        list.add(new Student("Student5",70));
        list.add(new Student("Student6",80));
        list.add(new Student("Student1",90));
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        populate(students);

        Predicate<Student> p = s-> s.marks >= 60;
        Function<Student,String> fun = s ->{
            if(s.marks >= 80){
                return "A";
            } else if(s.marks >= 60){
                return "B";
            } else if(s.marks >= 50){
                return "C";
            } else if(s.marks >= 35){
                return "D";
            }else {
                return "E";
            }
        };

        Consumer<Student> c = s->{
            System.out.println(" Nmae :" + s.name);
            System.out.println(" Marks :" + s.marks);
            System.out.println(" Grade :" + fun.apply(s));
        };

        for (Student s : students){
            if(p.test(s)){
                c.accept(s);
            }
        }
    }
}
