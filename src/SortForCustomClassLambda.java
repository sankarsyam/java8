import java.util.ArrayList;
import java.util.Collections;

class Employee{
     int eno;
     String ename;
     Employee(int eno,String ename){
         this.eno = eno;
         this.ename = ename;
     }
     public  String toString(){
         return eno+""+ename;
     }

}

public class SortForCustomClassLambda {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(20,"Sabu"));
        list.add(new Employee(10,"Kakka"));
        list.add(new Employee(300,"Shjia"));
        System.out.println("Before sort :"+ list);
        Collections.sort(list,(emp1,emp2) -> (emp1.eno > emp2.eno )? -1:(emp1.eno < emp2.eno)?1 : 0);
        System.out.println("After sort :"+ list);
    }
}
