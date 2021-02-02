package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(true, 800, levelCompleted, bonus);
        calculateScore(true, 10000, 8, 200);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Alex", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Carl", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Dave", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Erica", highScorePosition);

        long a = toMilesPerHour(10.25);
        System.out.println(a);

        printConversion(10.25);
        printMegaBytesAndKiloBytes(2500);

        shouldWakeUp(true, 8);

        isLeapYear(1924);

        areEqualByThreeDecimalPlaces(3.1756,3.1757);

        hasEqualSum(1,1,2);

        hasTeen(13, 14, 15);
        hasTeen(60, 13, 40);
        hasTeen(60, 60, 60);
        isTeen(16);
        isTeen(9);

        calcFeetAndInchesToCentimeters(6,0);
        calcFeetAndInchesToCentimeters(72);

        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(-1));

        System.out.println(area(5.0));
        System.out.println(area(-1.0));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));

        printYearsAndDays(561600);

        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
            return finalScore;
        }
        return -1;

    }

    public static void displayHighScorePosition(String player, int position){
        System.out.println(player + " managed to get into position. " + position + " is on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if (score >= 1000){
            return 1;
        }
        else if (score >= 500){
            return 2;
        }else if(score >= 100){
            return 3;
        }
        return 4;
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        }

        return Math.round(kilometersPerHour/ 1.609);
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value.");
        }else{
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h = " + milesPerHour + "mi/h");
        }

    }

    // 2500 KB = 2 MB and 452 KB
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            int megaBytes = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + "KB = " + megaBytes + "MB and " + remainder + " KB");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (!barking || hourOfDay < 0 || hourOfDay > 23)
            return false;
        else if (hourOfDay < 8)
            return true;
        else return hourOfDay == 22;
    }

    public static boolean isLeapYear(int year){
        if (year < 0 || year > 10000){
            return false;
        }
        if (year % 4 == 0){
            if (year % 100 == 0){
                return year % 400 == 0;
            }else{
                return true;
            }
        }else{
            return false;
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        return (int) (firstNumber * 1000) == (int) (secondNumber * 1000);
    }

    public static boolean hasEqualSum(int firstNum, int secondNum, int sum){
        return firstNum + secondNum == sum;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return firstAge >= 13 && firstAge <= 19 || secondAge >= 13 && secondAge <= 19 || thirdAge >= 13 && thirdAge <= 19;
    }

    public static boolean isTeen(int age){
        return age >= 13 && age <= 19;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet < 0 || inches < 0 && inches > 12){
            return -1;
        }
        double centimeters = (feet * 12)* 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + "ft and " + inches + "in : " + centimeters + "cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainder = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " and " + remainder + "in.");
        return calcFeetAndInchesToCentimeters(feet, remainder);
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || seconds < 0 || seconds > 60){
            return "Invalid value";
        }
        int hours = minutes / 60;
        int remainder = minutes % 60;
        return hours + "h " + remainder + "m " + seconds + "s";
    }

    public static String getDurationString(int seconds){
        if (seconds < 0){
            return "Invalid value";
        }
        int minutes = seconds / 60;
        int remainder = seconds % 60;
        return getDurationString(minutes, remainder);
    }

    public static double area(double radius){
        if (radius < 0) {
            return -1.0;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y){
        if (x < 0 || y < 0) {
            return -1.0;
        }
        return x * y;
    }

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else{
            long years = minutes / 525600L;
            long days = (minutes % 525600) / 1440;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }

    public static void printEqual(int x, int y, int z){
        if(x < 0 || y < 0 || z < 0){
            System.out.println("Invalid Value");
        }else if (x == y && y == z){
            System.out.println("All numbers are equal");
        }else if (x == y || y == z || x == z){
            System.out.println("Neither all are equal or different");
        }else{
            System.out.println("All numbers are different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer && temperature >= 25 && temperature <= 45){
            return true;
        }else if(!summer && temperature >= 25 && temperature <= 35){
            return true;
        }
        return false;
    }
}
