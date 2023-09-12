import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Problem4 {

    public void storeTextFileContent(String filename) throws IOException {

        String lines[] = new String[20];

        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line = br.readLine();
        while(line != null){
            int i =0;
           lines[i]=line;
           line = br.readLine();
           i++;
        }
        //for each loop
        for(String l : lines){
            System.out.println(l);
        }

    }
}
