import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CalculateService calculateService = new CalculateService();
        calculateService.calculate("+",2.0,8.0);
        calculateService.calculate("-",9.0,5.0);
        calculateService.calculate("*",4.0,6.0);
        calculateService.calculate("/",4.0,4.0);


    }
}