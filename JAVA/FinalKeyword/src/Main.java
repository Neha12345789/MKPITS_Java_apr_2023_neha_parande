import Loan.LoanRate;
import NestedClass.Outer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       System.out.println("enter the value of p, r and t");
       Scanner sc=new Scanner(System.in);
        int number1=  sc.nextInt();
       int number2=  sc.nextInt();
       int number3=  sc.nextInt();
//       InterestCalculation In =new InterestCalculation();
//        In.calculateinterest(number1,number2,number3);

        LoanRate lr=new LoanRate();
        lr.setAccountno("15428965");
        lr.setLoanamt(458000);
        lr.setDuration(6);
        InterestCalculation In =new InterestCalculation();
        In.calculateinterest(lr);


    }


}