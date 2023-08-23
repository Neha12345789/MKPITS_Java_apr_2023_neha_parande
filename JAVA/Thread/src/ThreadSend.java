public class ThreadSend  extends Thread {
    private String message;
    Sender sender;

    ThreadSend(String message, Sender sender) {
        this.message = message;
        this.sender = sender;
    }

    public void run() {

        System.out.println(message);

    }
}
