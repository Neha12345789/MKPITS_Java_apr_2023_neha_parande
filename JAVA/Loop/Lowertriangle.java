public class Lowertriangle {
    public static void main(String[]args){
        int number=5;
        for(int row=1;row<=number;row++){
            for (int space=5;space>=row;space--){
                System.out.print("");
            }
            for (int col=5;col>=number;col--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
