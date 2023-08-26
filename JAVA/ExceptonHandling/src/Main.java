public class Main {
    public static void main(String[] args) throws InvalidAmount {

       Handligsituation hs = new Handligsituation();
       hs.Arrayhandling(new int[]{15,21,45,16,42});

       Bank b = new Bank(10000);
       System.out.println("balance :" +b.getBalance());
       try {
           b.deposit(15);
       }catch (InvalidAmount e) {
           System.out.println(e.getmessege());
       }
        try {
            b.withdrawal(20000);
        } catch (InsufficientBalance e) {
            System.out.println(e.getmessege());
        }

    }
}