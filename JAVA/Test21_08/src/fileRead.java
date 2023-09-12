import java.io.*;

public class fileRead {

    public static void writeObjectToFile(Student s) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("NehaP.txt"));
        oos.writeObject(s);
        oos.close();
    }

    public static void readObjectToFile() throws IOException,ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NehaP.txt"));
        Student s = (Student) ois.readObject();
        System.out.println(s.getName()+" "+s.getMarks());
    }
    public static void countWordsLineChar() throws IOException {
        int lineCounter=0;
        int wordCounter=0;
        int characterCounter=0;

        BufferedReader bufferedReader = new BufferedReader(new FileReader("Neha.txt"));
        String string = bufferedReader.readLine();
        File file = new File("Neha.txt");
        if(file.exists()){
            while (string!=null){
                lineCounter++;
                String[]array = string.split(" ");
                wordCounter = wordCounter+ array.length;
                for (int number=0; number<array.length;number++){
                    characterCounter = characterCounter+array[number].length();
                }
                string = bufferedReader.readLine();

            }
            System.out.println("Number of line in a file :"+lineCounter);
            System.out.println("Number of word in a file  :"+wordCounter);
            System.out.println("Number of character in file ;"+characterCounter);
        }

    }

}
