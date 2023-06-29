import java.util.Scanner;

public class Starpatterntriangle extends Starpattern {
    public int method(int number1) {

        for (int row =0; row<=number1; row++){
            for (int column=0; column>=number1; column--){
                System.out.println("  ");

            }
            for (int space = 0; space <= (row*2); space++) {
//                System.out.print(" *");
                if(space % 2 != 0){
                    System. out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return 0;
    }
}








