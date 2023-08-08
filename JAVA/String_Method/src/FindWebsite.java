import java.util.Scanner;

public class FindWebsite {
    public static void Website(String websitename) {


        if (websitename.substring(0,11).equals("http://www.")) {

            if(websitename.substring(11).contains(".")){

                System.out.println("valid websitename");
            }
            else{
                System.out.println("invalid Websitename");
            }
        }
            else {
                System.out.println("Invalid Websitename");
            }

        }
    }
