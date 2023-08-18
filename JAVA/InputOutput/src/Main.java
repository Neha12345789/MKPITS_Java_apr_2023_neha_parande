import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)  {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Two Number for Addition");
        try {
            String number = bufferedReader.readLine();
            String number1 = bufferedReader.readLine();
            System.out.println("Addition of two number"+(Integer.parseInt(number)+Integer.parseInt(number1)));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        FileClassMethod fileClassMethod = new FileClassMethod();
        fileClassMethod.CompareFile();
        fileClassMethod.isDirectory();
        fileClassMethod.listOfFile();
        fileClassMethod.findName();
        fileClassMethod.absolute();
        fileClassMethod.lastModify();
        fileClassMethod.delete();
        fileClassMethod.Executable();

    }
}