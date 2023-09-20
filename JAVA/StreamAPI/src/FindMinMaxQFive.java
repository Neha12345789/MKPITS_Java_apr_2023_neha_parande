import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FindMinMaxQFive {
    public static void findMinMaxOfCustomObject(){
     List<Employee> list = new ArrayList<>();
     list.add(new Employee(120,"Komal"));
        list.add(new Employee(125,"Apeksha"));
        list.add(new Employee(115,"Rasika"));
        list.add(new Employee(110,"Ashwini"));
        list.add(new Employee(105,"Kalyani"));
        list.add(new Employee(135,"Rutuja"));
        System.out.println("Employee Code And Name : " + list);
        Employee EmployeeMin = list.stream().min(Comparator.comparingInt(Employee::getEmployeeCode)).get();
        System.out.println("Youngest Employee= "+EmployeeMin);
        Employee EmployeeMax = list.stream().max(Comparator.comparingInt(Employee::getEmployeeCode)).get();
        System.out.println("Oldest Employee= "+EmployeeMax);

    }
}
