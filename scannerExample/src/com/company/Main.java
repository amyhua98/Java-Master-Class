package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	    Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your year of birth: ");
//
//        boolean hasNextInt = scanner.hasNextInt();
//
//        if(hasNextInt){
//            int yearOfBirth = scanner.nextInt();
//            scanner.nextLine();
//            int age = 2020 - yearOfBirth;
//
//            System.out.println("Enter your name: ");
//            String name = scanner.nextLine();
//
//            System.out.println("Your name is " + name);
//            if (age >= 0 && age <= 100){
//                System.out.println("Your name is " + name + ". Your age is " + age);
//            }else{
//                System.out.println("Invalid age");
//            }
//        }else{
//            System.out.println("Unable to parse year of birth");
//        }
//        scanner.close();


//        READING INPUT CHALLENGE

//        Scanner scanner = new Scanner(System.in);
//        int count = 0;
//        int sum = 0;
//        while(count < 10){
//            int order = count + 1;
//
//            System.out.println("Enter number #" + order + ":");
//            boolean isInt = scanner.hasNextInt();
//            if(isInt){
//                int add = scanner.nextInt();
//                sum+= add;
//                count++;
//            }else{
//                System.out.println("invalid Number");
//            }
//            scanner.nextLine();
//        }
//        scanner.close();
//        System.out.println(sum);


//    MIN AND MAX CHALLENGE
//        Scanner scanner = new Scanner(System.in);
//        int min = 0;
//        int max = 0;
//        boolean first = true;
//
//        while (true){
//            System.out.println("Enter the Number: ");
//            boolean isAnInt = scanner.hasNextInt();
//
//            if (isAnInt){
//
//                int number = scanner.nextInt();
//
//                if (first){
//                    first = false;
//                    min = number;
//                    max = number;
//                }
//
//                if (number>max){
//                    max=number;
//                }
//
//                if (number<min){
//                    min=number;
//                }
//
//
//            }else {
//                break;
//            }
//            scanner.nextLine();
//        }
//
//        System.out.println("Min = " + min + ", Max = " + max);
//        scanner.close();

//        inputThenPrintSumAndAverage();

        getBucketCount(2.75,3.25,2.5,1);

        getBucketCount(3.4, 2.1, 1.5);

        getBucketCount(3.4, 1.5);

    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double count = 0;
        while(true){
            boolean isNum = scanner.hasNextLong();
            if(isNum){
                long num = scanner.nextLong();
                count ++;
                sum += num;
            }
            else{
                break;
            }
            scanner.nextLine();
        }
        long avg = Math.round(sum/count);
        System.out.println("SUM = " + (long)sum + " AVG = " + avg);

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        double totalArea = width * height;
        int count = (int) Math.ceil(((totalArea / areaPerBucket) - extraBuckets));
        return count;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double totalArea = width * height;
        int count = (int) Math.ceil(totalArea / areaPerBucket);
        System.out.println(count);
        return count;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        int count = (int) Math.ceil(area / areaPerBucket);
        System.out.println(count);
        return count;
    }

}
