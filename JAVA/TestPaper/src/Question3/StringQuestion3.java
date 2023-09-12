package Question3;

public class StringQuestion3{

    public void display() throws MisException {
        String str1 = "How are You ?";
        String str2 = "I am gine";

        if(!str1.equals(str2)){
            throw new MisException();
        }
    }

}
