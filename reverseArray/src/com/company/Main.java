package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        reverse(array);
    }

    private static void reverse(int[] array){
        int first = 0;
        int last = array.length-1;

        System.out.println("Array = " + Arrays.toString(array));
        while(last>first){
            int temp = array[first];
            array[first] = array[last];
            array[last] = temp;
            first++;
            last--;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
