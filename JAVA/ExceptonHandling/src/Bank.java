public class Bank {


    private int balance;

    public Bank() {
        this.balance=50000;

    }

    public Bank(int balance) {
        this.balance = balance;
    }
//    public void setBalance(int balance) {
//        this.balance = balance;
//    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amt) throws InvalidAmount{
        if (amt < 100) {
            throw new InvalidAmount();
        }

        balance = balance + amt;
        System.out.println("deposit ; " + amt);

    }

        public void withdrawal(int amt) throws InsufficientBalance{
        if (amt > balance) {
                throw new InsufficientBalance();
            }
        balance = balance - amt;
        System.out.println("Withdrawal ; " + amt);
            }
        }

