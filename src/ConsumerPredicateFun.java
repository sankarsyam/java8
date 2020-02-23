import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student1{
    String name;
    int marks;
    Student1(String name,int marks){
        this.name = name;
        this.marks = marks;
    }
}

public class ConsumerPredicateFun {
    public static void populate(ArrayList<Student1> list){
        list.add(new Student1("Student1",20));
        list.add(new Student1("Student2",40));
        list.add(new Student1("Student3",50));
        list.add(new Student1("Student4",60));
        list.add(new Student1("Student5",70));
        list.add(new Student1("Student6",80));
        list.add(new Student1("Student1",90));
    }

    public static void main(String[] args) {
        ArrayList<Student1> students = new ArrayList<Student1>();
        populate(students);

        Predicate<Student1> p = s-> s.marks >= 60;
        Function<Student1,String> fun = s ->{
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

        Consumer<Student1> c = s->{
            System.out.println(" Nmae :" + s.name);
            System.out.println(" Marks :" + s.marks);
            System.out.println(" Grade :" + fun.apply(s));
        };

        for (Student1 s : students){
            if(p.test(s)){
                c.accept(s);
            }
        }
    }
}
