package Loan;

public class LoanRate {
    private String accountno;

    private double loanamt;

    private int duration;

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {

        this.accountno = accountno;
    }

    public double getLoanamt() {

        return loanamt;
    }

    public void setLoanamt(double loanamt) {

        this.loanamt = loanamt;
    }

    public int getDuration() {


        return duration;
    }

    public void setDuration(int duration) {

        this.duration = duration;
    }

    public static int calculateloan(int a, int l, int d){
        return (a+l+d)/100;

    }

}
