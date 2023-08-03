package Calc;

import Calc.*;

import java.util.Scanner;

class main{
    public static void main(String[] args){
        Calculation s;
        System.out.println("enter the choise number");
        System.out.println("choise 1, choise 2, choise 3, choise 4, choise 5");
        Scanner sc= new Scanner(System.in);
        int choise = sc.nextInt();


        switch (choise){

                case 1 :
                s = new Addition();
                System.out.println("enter the two number");
                int z = s.getcalculation(sc.nextInt(), sc.nextInt());
                System.out.println("Addition of two no." + z);
                break;

                case 2 :
                s = new Subtraction();
                System.out.println("enter the two number");
                z = s.getcalculation(sc.nextInt(), sc.nextInt());
                System.out.println("Subtraction of two no." + z);
                break;


                case 3 :
                s = new Multiply();
                System.out.println("enter the two number");
                z = s.getcalculation(sc.nextInt(), sc.nextInt());
                System.out.println("Multipiation of two no." + z);
                break;


                case 4 :
                s = new Division();
                System.out.println("enter the two number");
                z = s.getcalculation(sc.nextInt(), sc.nextInt());
                System.out.println("Division of two no." + z);
                break;

                case 5 :
                s = new Modulus();
                System.out.println("enter the two number");
                z = s.getcalculation(sc.nextInt(), sc.nextInt());
                System.out.println("Remainder of two no." + z);
                break;

            default:
                System.out.println("enter choise is invalid");

        }


    }
}