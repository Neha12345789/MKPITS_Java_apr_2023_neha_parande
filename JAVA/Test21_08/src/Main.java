import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Write_Read wr = new Write_Read();
        wr.writingToRead();
        wr.readToWrite();
        wr.inputStreamReading();
        wr.inputStreamWriting();

        Student s = new Student("Neha_Parande", 89);
        fileRead.writeObjectToFile(s);
        fileRead.readObjectToFile();

        Problem4 pb = new Problem4();
        pb.storeTextFileContent("Neha.txt");

        fileRead.countWordsLineChar();
        LongestWord.toFindLongestWord();
        LongestWord.findLongestWordByScanner("Neha.txt");

        ReadCsvFile.ReadDetailOfCsvFile();

    }

}