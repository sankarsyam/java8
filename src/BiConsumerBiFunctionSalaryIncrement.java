import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BiConsumerBiFunctionSalaryIncrement {
    public static void main(String[] args) {

        ArrayList<EmployeeAndSalary> employeeAndSalaries = new ArrayList<EmployeeAndSalary>();

        BiFunction<String,Double,EmployeeAndSalary> biFun = (name,salary)  -> new EmployeeAndSalary(name,salary);
        employeeAndSalaries.add(biFun.apply("syam",2000.0));
        employeeAndSalaries.add(biFun.apply("Kutti",3000.0));
        employeeAndSalaries.add(biFun.apply("Sunny",1000.0));
        employeeAndSalaries.add(biFun.apply("Bunny",4000.0));

        BiConsumer<EmployeeAndSalary,Double> biConsumer = (e,increment) -> e.salary = e.salary+increment;

        for (EmployeeAndSalary employee:employeeAndSalaries){
            biConsumer.accept(employee,500.0);
        }

        for (EmployeeAndSalary emp:employeeAndSalaries){
            System.out.println(emp);
        }
    }
}
