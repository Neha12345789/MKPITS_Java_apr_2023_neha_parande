import Loan.LoanRate;

final public class InterestCalculation {

    final public static void calculateinterest(LoanRate loanRate){
   //   final double result=(r*t)/100;
        System.out.println(loanRate.getLoanamt()*loanRate.getDuration());
       // System.out.println("the rate of interest will be = " + result);
    }
}
