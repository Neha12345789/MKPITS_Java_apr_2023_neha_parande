package Enumarator;

import java.time.Month;

public class enumDemo {

    public static void FindMonth() {

        enum Months {January, February, March, April, May, June, July, August, September, October, November, December}

//        enumDemo em = new enumDemo();
//        for (Month M : Month.values()) {
//            System.out.println(M);
            Month m = Month.JANUARY;
            switch (m) {

                case JANUARY:
                case MARCH:
                case MAY:
                case JULY:
                case AUGUST:
                case OCTOBER:
                case DECEMBER:
                    System.out.println("31 days");
                    break;

                case FEBRUARY:
                case APRIL:
                case JUNE:
                case SEPTEMBER:
                case NOVEMBER:
                    System.out.println("30 days ");
                    break;

                default:

            }

        }


    }
