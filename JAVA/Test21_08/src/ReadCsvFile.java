import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCsvFile {
    public static void ReadDetailOfCsvFile(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\ACER\\Desktop\\username.csv"));
            String Details = bufferedReader.readLine();
//            System.out.println(string);
            while (Details!=null){
//                System.out.println(Details);
                String[]name = Details.split(";");
                for(int counter = 0; counter < name.length; counter++) {
                    System.out.println("username : " + name[0] + "\t" + "Identifier : " + name[1] + "\t" + "first name : " + name[2] + "\t" + "last name : " + name[3]);
                    Details = bufferedReader.readLine();
                }

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
