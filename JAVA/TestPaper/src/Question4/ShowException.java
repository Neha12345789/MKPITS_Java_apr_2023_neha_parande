package Question4;

public class ShowException extends Exception{

    public static void indexOutOfBound() throws  IndexOutOfBoundsException{
       String newString = "samiksha";
       String substring;
        if (!(newString.indexOf(0) ==0)) {
            throw new IndexOutOfBoundsException();
        }


    }
}
