package com.company;

public class Main {

    public static void main(String[] args) {
        double first = 20.00d;
        double second = 80.00d;
        double total = (first + second) * 100d;
        System.out.println(total);

        double remainder = total % 30.00d;

        boolean hasRemainder = remainder != 0 ? true : false;
        System.out.println("Is there remainders? " + hasRemainder);

        if (hasRemainder) {
            System.out.println("Got some remainder : " + remainder);
        }


//	    int result = 1 + 2;
//        System.out.println("1 + 2 = " + result);
//        result -= 2;
//        System.out.println("3 - 2 = " + result);
//        result *= 10;
//        System.out.println("1 * 10 = " + result);
//        result /= 2;
//        System.out.println("10 / 2 = " + result);
//        result %= 2;
//        System.out.println("5 % 2 = " + result);
//
//        boolean isAlien = false;
//        if (!isAlien){
//            System.out.println("Not alien.");
//        }
//
//        int topScore = 100;
//        if(topScore != 100){
//            System.out.println("Not top score!");
//        }
//
//        int secondScore = 60;
//        if (secondScore < topScore && secondScore == 60){
//            System.out.println("Score in 60");
//        }
//
//        int thirdScore = 80;
//        if (thirdScore < topScore || thirdScore < 99){
//            System.out.println("Less than top");
//        }
//
//        boolean isCar = false;
//        if (isCar){
//            System.out.println("This is a car.");
//        }
//        //ternary operator
//        boolean wasCar = isCar ? true : false;


    }
}
