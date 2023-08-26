import java.io.*;

public class UserDefineFileReading {
    public void ReadUserDefineFile() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        try {
            System.out.println("Enter the file name : ");
            String fileName = null;
            try {
                fileName = bufferedReader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            File file = new File(fileName);
            if (file.exists()) {
                BufferedReader bufferedReader1 = null;
                try {
                    bufferedReader1 = new BufferedReader(new FileReader(file));
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                String str = null;
                try {
                    str = bufferedReader1.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                while (str != null) {
                    System.out.println(str);
                    try {
                        str = bufferedReader1.readLine();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}

