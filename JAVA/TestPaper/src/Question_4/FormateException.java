package Question_4;

public class FormateException extends Exception{
    public static void ShowException(){
        String string1 = "Shubham";
        int number = Integer.parseInt(string1);
        System.out.println(number);
    }
}
