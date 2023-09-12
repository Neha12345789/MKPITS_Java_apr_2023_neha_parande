import java.io.*;
import java.util.Scanner;

import static java.lang.System.in;

public class LongestWord {

    public static void toFindLongestWord() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Neha.txt"));
        String string = bufferedReader.readLine();
        String longestword = new String();

        while (string!=null){
            String[]array=string.split(" ");
            for(int number=0; number<array.length; number++){
                if(array[number].length()>longestword.length()){
                    longestword=array[number];
                }
                string=bufferedReader.readLine();

            }
            System.out.println("Longest word From the file :"+longestword);

        }
    }

    public static void findLongestWordByScanner(String filename){
        try {
            Scanner scanner = new Scanner(new File(filename));
            String longestWord="";
            while (scanner.hasNext()) {
                String word= scanner.next();
                if (word.length()>longestWord.length()){
                    longestWord=word;
            }
            }
            System.out.println(longestWord);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
