import java.io.*;

public class Write_Read {

    public void writingToRead() throws IOException, FileNotFoundException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("Neha.txt"));
        File f = new File("Neha.txt");
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        long date = f.lastModified();
        System.out.println(date);
        BufferedWriter bw1 = new BufferedWriter(bw);
        bw1.write("Welcome To Mkpit");
        bw1.close();
        System.out.println("done");

    }

    public void readToWrite() throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("Neha.txt"));

        BufferedReader br1 = new BufferedReader(br);
        try {
            String name = br1.readLine();
            System.out.println(name);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void inputStreamReading() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader br1 = new BufferedReader(br);

        try {
            System.out.println("Enter the name");
            String name1 = br1.readLine();
            System.out.println("welcome to Mkpits : " + name1);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void inputStreamWriting() {
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter the File name : ");
            String fileName = br2.readLine();
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

