import java.io.*;

public class writtenToReader {
    public void ReadingFile() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader;
        try {
                bufferedReader = new BufferedReader(new FileReader("Neha.txt"));
                String str = bufferedReader.readLine();
                while (str != null) {

//                    System.out.println(str);
                    str = bufferedReader.readLine();
                }

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }


    }
