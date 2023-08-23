public class NotifyThread extends Thread{
    int sum;
    public void run(){
        synchronized (this) {
            for (int i = 0; i<=100; i++){

                sum += i;

            }
            notify();
        }

    }
}
