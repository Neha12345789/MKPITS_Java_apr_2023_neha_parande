public class Main {
    public static void main(String[] args) {
        FirstThread ft = new FirstThread();
        FirstThread ft1 = new FirstThread();
//        ft.start();
//        ft1.start();

        try {
            ft.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ft1.start();

        Sender sender = new Sender();

        ThreadSend threadSend = new ThreadSend("first message", sender);
        ThreadSend threadSend1 = new ThreadSend("second message", sender);
        threadSend.start();
        threadSend1.start();

//        WaitThread1 waitThread1 = new WaitThread1();
//        waitThread1.run();
        NotifyThread notifyThread = new NotifyThread();
        notifyThread.start();

        synchronized (notifyThread) {
            try {
                notifyThread.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Total of numbers :" + notifyThread.sum);

        }
        MyThread myThread = new MyThread();
        myThread.start();
        synchronized (myThread){
            try {
                myThread.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(myThread.sum);
        }

    }

}
