import java.io.*;

public class CopyFile {
    public void fileCopy(String File1, String File2) throws IOException,  FileNotFoundException {
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(File1));
        String one = bufferedReader1.readLine();
        BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter(File2));
        while (one!= null){
            bufferedWriter1.write(one);
            String sec = bufferedReader1.readLine();
        }
        bufferedWriter1.close();
    }
}

