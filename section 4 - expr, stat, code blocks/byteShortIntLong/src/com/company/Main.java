package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
	    int myValue = 50;
	    byte byteNum = 10;
        short shortNum = 20;
        long totalValue = 50000L + (10L*(byteNum + shortNum + myValue));
        System.out.println(totalValue);


//	    int myMinIntValue = Integer.MIN_VALUE;
//        int myMaxIntValue = Integer.MAX_VALUE;
//        System.out.println("Integer Min Value = " + myMinIntValue);
//        System.out.println("Integer Max Value = " + myMaxIntValue);
//
//        byte myMinByteValue = Byte.MIN_VALUE;
//        byte myMaxByteValue = Byte.MAX_VALUE;
//        System.out.println("Byte Min Value = " + myMinByteValue);
//        System.out.println("Byte Max Value = " + myMaxByteValue);
//
//        short myMinShortValue = Short.MIN_VALUE;
//        short myMaxShortValue = Short.MAX_VALUE;
//        System.out.println("Short Min Value = " + myMinShortValue);
//        System.out.println("Short Max Value = " + myMaxShortValue);
//
//        long myLongValue = 100l;
//        long myMinLongValue = Long.MIN_VALUE;
//        long myMaxLongValue = Long.MAX_VALUE;
//        System.out.println("Long Min Value = " + myMinLongValue);
//        System.out.println("Long Max Value = " + myMaxLongValue);

        double lbs = 1;
        double kilograms = lbs * 0.45359237;
        System.out.println("lbs to kilo = " + kilograms);


//	    float myMinFloatValue = Float.MIN_VALUE;
//        float myMaxFloatValue = Float.MAX_VALUE;
//        System.out.println("Float Min Value = " + myMinFloatValue);
//        System.out.println("Float Max Value = " + myMaxFloatValue);
//
//        double myMinDoubleValue = Double.MIN_VALUE;
//        double myMaxDoubleValue = Double.MAX_VALUE;
//        System.out.println("Double Min Value = " + myMinDoubleValue);
//        System.out.println("Double Max Value = " + myMaxDoubleValue);
//
//        int myIntValue = 5 / 2;
//        float myFloatValue = 5f / 2;
//        double myDoubleValue = 5d;
//        System.out.println("Int Value = " + myIntValue);
//        System.out.println("Float Value = " + myFloatValue);
//        System.out.println("Double Value = " + myDoubleValue);

    }
}
