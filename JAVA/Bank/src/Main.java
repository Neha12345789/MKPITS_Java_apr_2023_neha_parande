public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("1234","Neha",1000);
        Customer customer2 = new Customer("567","Bhagyshei",500);
        System.out.println("Balance = "+customer1.displayDetails());
        System.out.println("BAlance = "+customer2.displayDetails());


        Transaction transaction = new Transaction();
        System.out.println("Balance Amount :" +transaction.Deposit(5000,customer1));
        System.out.println("Balance Amount  :" +transaction.Withdrawal(100,customer2));

        transaction.Transfer(customer1,customer2,500);
        System.out.println(customer1.getBalance());
        System.out.println(customer2.getBalance());
    }
}