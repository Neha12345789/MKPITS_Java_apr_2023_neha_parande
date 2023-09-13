import java.io.File;

public class FileClassMethod {
    public void CompareFile(){
        File file = new File("C:\\Program File");
        System.out.println(file.compareTo(new File("C:\\Program File")));


    }
    public void isDirectory(){
        File file1 = new File("E:\\Directry","DESKTOP");
        System.out.println(file1.isDirectory());

    }

    public void findName(){
        File file2 = new File("E\\");
        System.out.println(file2.getName());
    }

    public void listOfFile(){
        File file2 = new File("D:\\");
        File fn[] = file2.listFiles();
        for(File nmae :fn){
            System.out.println(fn);
        }
    }

    public void absolute(){
        File File3 = new File("D:\\MKPITS");
        System.out.println(File3.isFile());

    }

    public void lastModify(){
        File file4 = new File("D:JAVA");
        System.out.println(file4.lastModified());
    }

    public void delete(){
        File file5 = new File("E://Extension");
        System.out.println(file5.exists());
        System.out.println(file5.delete());
    }

    public void Executable(){
        File file6 = new File("E://Extension");
        System.out.println(file6.setExecutable(true));
    }


}

