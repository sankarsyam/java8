import java.util.ArrayList;
import java.util.function.Predicate;

class EmployeeSample {
    String name;
    double salary;
    String city;
    String designation;
    EmployeeSample(String name,double salary,String city,String designation){
        this.city = city;
        this.designation = designation;
        this.name = name;
        this.salary = salary;
    }
    public  String toString(){
        String s= String.format("%s,%s,%.2f,%s",name,designation,salary,city);
        return s;
    }

}

public class PredicateEmployee {
    public  static  void populate( ArrayList<EmployeeSample> list){
         list.add(new EmployeeSample("Syam",30000.000,"Kochi","developer"));
        list.add(new EmployeeSample("Sunny",60000.000,"Bangalore","Manager"));
        list.add(new EmployeeSample("Mallika",80000.000,"Bangalore","Manager"));
        list.add(new EmployeeSample("Sumi",15000.000,"Kochi","Lead"));
        list.add(new EmployeeSample("Sabu",18000.000,"Kochi","developer"));
        list.add(new EmployeeSample("Ravi",13000.000,"Bangalore","developer"));
    }

    public  static  void  display(Predicate<EmployeeSample> p , ArrayList<EmployeeSample> list){
        for(EmployeeSample employee:list){
            if(p.test(employee)){
                System.out.println(employee);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<EmployeeSample> list = new ArrayList<EmployeeSample>();
        populate(list);

        System.out.println("All employees");
        System.out.println(list);

        Predicate<EmployeeSample> manager = employeeSample ->  employeeSample.designation.equals("Manager");
        System.out.println("Managers ********");
        display(manager,list);
        System.out.println("********");

        Predicate<EmployeeSample> bangaloreEmployee = employeeSample ->  employeeSample.city.equals("Bangalore");
        System.out.println("Bangalore employee ********");
        display(bangaloreEmployee,list);
        System.out.println("********");

        System.out.println("Salary below 20k ********");
        Predicate<EmployeeSample>  salaryLess = employeeSample -> employeeSample.salary<20000;
        display(salaryLess,list);
        System.out.println("********");

        System.out.println("Managers from bangalore ********");
        display(manager.and(bangaloreEmployee),list); // and
        System.out.println("********");

        System.out.println("Managers or  Salary below 20k********");
        display(manager.or(salaryLess),list); // or
        System.out.println("********");

        System.out.println("Employees not a manager********");
        display(manager.negate(),list); // negate
        System.out.println("********");

    }
}
