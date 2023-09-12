import java.util.Scanner;

public class FullTimeEmployee extends Employee{
    int workingHours;


    @Override
    void calculateSalary() {
        int Totalsalary = paymentPerHour*workingHours;
        System.out.println("Monthly Salary Of Employee"+Totalsalary);
    }
}
