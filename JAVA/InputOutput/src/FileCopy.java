import java.io.*;

public class FileCopy{
    public void copyPaste(String file1, String file2) throws IOException, FileNotFoundException {
        System.out.println("Enter the source file name");
        File file = new File(file1);
        if(file.exists()) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
            String string = bufferedReader.readLine();
            while(string!=null){

                System.out.println(string);
                string = bufferedReader.readLine();
        }
        }



    }
}