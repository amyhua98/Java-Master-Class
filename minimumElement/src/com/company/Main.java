package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

//        int[] test = readInteger(count);
//        int returnedMin = findMin(test);
//
//        System.out.println(Arrays.toString(test));
//        System.out.println("Min = " + returnedMin);

        readElements(5);
    }

    public static int readInteger(){
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        return count;
    }

    public static int[] readElements(int count){
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++){
            System.out.println("Enter a number: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin( int[] array){
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            int value = array[i];
            if(minimum > value){
                minimum = value;
            }
        }
        return minimum;
    }



}
