package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(-1221));

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(-10));

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));

        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));

        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(9,99,999));
        System.out.println(isValid(9));

        System.out.println(getGreatestCommonDivisor(1010, 10));
        System.out.println(getGreatestCommonDivisor(9, 18));

        printFactors(6);

        System.out.println(isPerfectNumber(28));

        System.out.println(reverse(-121));
        numberToWords(234);

        System.out.println(canPack(2, 1, 5));
        System.out.println(canPack(-2, 1, 5));

        System.out.println(getLargestPrime(6));

        printSquareStar(8);

    }

    public static boolean isPalindrome(int number){
        int starting = number;
        int reverse = 0;
        while (number != 0){
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        return starting == reverse;
    }

    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }
        int last = number % 10;
        while (number > 9){
            number /= 10;
        }
        int first = number;
        return first + last;
    }

    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }
        int evenSum = 0;
        while (number != 0){
            int nextDigit = number % 10;
            if(nextDigit % 2 == 0){
                evenSum += nextDigit;
            }
            number /= 10;
        }
        return evenSum;
    }

    public static boolean hasSharedDigit(int a, int b){
        if (a < 10 || a > 99 || b < 10 || b > 99 ){
            return false;
        }
        int aDigit = a % 10;
        a /= 10;
        int bDigit = b % 10;
        b /= 10;
        return aDigit == bDigit || aDigit == b || a == bDigit || a == b;
    }

    public static boolean hasSameLastDigit(int x,int y,int z){
        if((x>9&&x<1001)&&(y>9&&y<1001)&&(z>9&&z<1001)){
            x = x % 10;
            y = y % 10;
            z = z % 10;
            return (x == y) || (y == z) || (z == x) || (x == y && y == z && x == z);
        }
        return false;
    }
    public static boolean isValid(int i){
        return i > 9 && i < 1001;
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }
        int greatestDivisor = 1;
        int lesser = first < second ? first : second;
        for (int i = 2; i < lesser + 1; i++){
            if (first % i == 0 && second % i == 0){
                greatestDivisor = i;
            }
        }
        return greatestDivisor;
    }

    public static void printFactors(int number){
        if (number < 1){
            System.out.println("Invalid Value");
        }
        for (int i = 1; i < number + 1; i++){
            if (number % i == 0){
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfectNumber(int number){
        if (number < 1){
            return false;
        }
        int sumOfDivisor = 0;
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                sumOfDivisor += i;
            }
        }
        System.out.println(sumOfDivisor);
        return sumOfDivisor == number;
    }

    public static void numberToWords(int number) {
        if (number >= 0) {
            int reversed = reverse(number);
            int originalNumberDigits = getDigitCount(number);
            for (int i = 0; i < originalNumberDigits; i ++) {
                int digit = reversed % 10;
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reversed /= 10;
            }
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        int lastDigit = 0;
        while (number != 0) {
            lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        int sumOfDigits = 0;
        if (number >= 0) {
            if (number == 0) {
                sumOfDigits = 1;
            }
            while (number > 0) {
                int lastDigit = number % 10;
                number /= 10;
                sumOfDigits++;
            }
            return sumOfDigits;
        }
        return -1;
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        if (goal > (bigCount * 5) + smallCount){
            return false;
        }
        if((goal % 5) > smallCount){
            return false;
        }
        return true;

    }

    public static int getLargestPrime(int number){
        if (number < 2){
            return -1;
        }
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                number /= i;
                i --;
            }
        }
        return number;
    }

    public static void printSquareStar(int number){
        if (number < 5){
            System.out.println("Invalid Value");
        }else{
            for(int row = 1; row <= number; row++){
                for(int column = 1; column <= number; column ++){
                    if(row == 1 || row == number || column == 1 || column == number){
                        System.out.print("*");
                    }else if( row == column){
                        System.out.print("*");
                    }else if(column == (number - row) + 1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }


}
