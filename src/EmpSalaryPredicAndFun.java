import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class EmployeeAndSalary{
    String name;
    double salary;
    EmployeeAndSalary(String name,double salary){
        this.name= name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name+":"+salary;
    }
}
// to give increment to all employees whose salary less than 15000
public class EmpSalaryPredicAndFun {

    public  static  void populate( ArrayList<EmployeeAndSalary> list){
        list.add(new EmployeeAndSalary("Syam",30000.000));
        list.add(new EmployeeAndSalary("Sunny",6000.000));
        list.add(new EmployeeAndSalary("Mallika",8000.000));
        list.add(new EmployeeAndSalary("Sumi",15000.000));
        list.add(new EmployeeAndSalary("Sabu",18000.000));
        list.add(new EmployeeAndSalary("Ravi",13000.000));
    }
    public static void main(String[] args) {
        ArrayList<EmployeeAndSalary> list= new ArrayList<EmployeeAndSalary>();
        populate(list);
        System.out.println("All Employees*******" );
        System.out.println(list);
        Predicate<EmployeeAndSalary> p = e -> e.salary<15000;
        Function<EmployeeAndSalary,EmployeeAndSalary> fun = e ->{
            e.salary = e.salary+500;
            return  e;
        };

        System.out.println("After increment *********");
        ArrayList<EmployeeAndSalary> newList = new ArrayList<EmployeeAndSalary>();
        for( EmployeeAndSalary emp:list){
            if(p.test(emp)){
                newList.add(fun.apply(emp));
            }
        }
        System.out.println(newList);
    }
}
