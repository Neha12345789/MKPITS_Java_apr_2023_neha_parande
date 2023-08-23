public class Sender {
   public void send(String message){
      synchronized (this) {
          System.out.println("sending" + message);
          System.out.println("send" + message);
      }

    }
}






