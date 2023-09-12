package Recursion;

public class Factorial {

    public static int findFactorial(int a) {
        if (a == 1)
            return 1;
        else
            return a * findFactorial(a - 1);
    }

    }

