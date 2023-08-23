public class MyThread extends Thread {
    int sum;

    public void run() {
        synchronized (this) {
            for (int i = 0; i <= 99; i++) {
                sum += i;
//                System.out.println(sum);
            }
            notify();
        }
    }
}
