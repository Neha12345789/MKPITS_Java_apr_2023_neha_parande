
public class Customer {
    private String Accountno;
   private String CustomerName;
    private double Balance;

    public String getAccountno() {
        return Accountno;
    }

    public void setAccountno(String accountno) {
        Accountno = accountno;
    }

    public Customer(String accountno, String customerName, double balance) {
        Accountno = accountno;
        CustomerName = customerName;
        Balance = balance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }
    public double displayDetails(){
        System.out.println("Account Number  : "+Accountno);
        System.out.println("Customer Name  : " +CustomerName);
       return Balance;
    }

}
