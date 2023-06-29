public class Rightangle {
    public static void main (String[]args){
        int row = 5;
        for (row=1; row<=5; row++){
            for (int col=1; col<=row; col++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
