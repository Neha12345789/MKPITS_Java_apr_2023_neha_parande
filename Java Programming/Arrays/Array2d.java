package com.mkpits.arrays;

public class Main {

    public static void main(String args[]) {
        int arr[][] = {{1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15},
                        {16,17,18,19,20}};

       for(int rows = 0; rows < 4; rows++) {
           for(int columns = 0; columns < 5; columns++) {
               System.out.println("Array[" + rows + "][" + columns + "] , Value: " + arr[rows][columns]);
           }
       }
    }
}
