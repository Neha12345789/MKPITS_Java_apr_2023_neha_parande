import java.io.*;

public class WriterBuffer {
     public void WriterBufferMethod(){
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         try {
             BufferedWriter bw = new BufferedWriter(new FileWriter("Neha.txt"));
             System.out.println("Enter the names");
             String name = br.readLine();
             while (true){
                 if(name.equals("Stop"))
                    break;
                 bw.write(name + "\n");
                 name = br.readLine();
             }
             bw.close();
         } catch (IOException e) {
             throw new RuntimeException(e);
         }

     }

}
