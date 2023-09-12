package WriteAndReadObectOfHashMap;

import java.io.*;
import java.util.HashMap;

public class WriteHashMapObject{
    public void WriteObject(HashMap hashMap) throws IOException {

        FileOutputStream fileOutputStream =  new FileOutputStream(new File("neha.txt"));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(hashMap);
        objectOutputStream.close();

    }
    public void ReadObject(HashMap hashMap1) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("neha.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        objectInputStream.readObject();
        objectInputStream.close();


    }
    public static void main(String[] args){
        WriteHashMapObject writeHashMapObject = new WriteHashMapObject();
        
    }
    }



