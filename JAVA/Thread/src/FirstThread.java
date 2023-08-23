public class FirstThread extends Thread{
    public void run(){
        for(int i=0; i<=4; i++){
            System.out.println(getName());
        }
    }
}
