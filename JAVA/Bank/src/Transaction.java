public class Transaction {

    public double Deposit(double amount,Customer customer1) {
        System.out.println("Amount Credited :" + amount);
          customer1.setBalance(customer1.getBalance()+amount);
          return customer1.getBalance();
    }

    public double Withdrawal(double amount, Customer customer2){
        System.out.println("Amount Debited :" +amount);
        customer2.setBalance(customer2.getBalance()-amount);
        return customer2.getBalance();
    }

    public void Transfer(Customer customer1,Customer customer2,double amount){
        customer1.setBalance(customer1.getBalance()-amount);
        customer2.setBalance(customer2.getBalance()+amount);
    }



}
