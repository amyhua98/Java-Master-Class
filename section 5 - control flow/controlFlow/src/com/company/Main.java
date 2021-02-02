package com.company;

public class Main {

    public static void main(String[] args) {
	    int value = 3;
	    if (value == 1){
            System.out.println("Value was 1");
        }else if (value == 2){
            System.out.println("Value was 2");
        }else{
            System.out.println("Value was not 1 or 2");
        }

	    int switchValue = 1;
	    switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        char charValue = 'D';
	    switch (charValue){
            case 'A':
                System.out.println("This is A");
                break;
            case 'B':
                System.out.println("This is B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("This is " + charValue);
                break;
            default:
                System.out.println("Not like the other values.");
        }

        printDayOfTheWeek(2);
	    dayOfTheWeekChallenge(2);
	    dayOfTheWeekChallenge(9);
	    printNumberInWord(4);

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));

        System.out.println(calculateInterest(10000, 2));
        for (int i = 2; i < 9; i++){
            System.out.println("$10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }

        System.out.println(isPrime(23));


//        FOR LOOP EXAMPLE
//        int sum = 0;
//        int count = 0;
//        for (int i = 1; i <1001; i++){
//            if( i % 3 == 0 && i % 5 == 0){
//                System.out.println(i);
//                count ++;
//                sum += i;
//            }
//            if(count == 5){
//                break;
//            }
//        }
//        System.out.println("Sum = " + sum);

        System.out.println(sumOdd(1,100));


//        WHILE LOOP EXAMPLE
//        int count = 1;
//        while(count != 6){
//            System.out.println("Count value is " + count);
//            count ++;
//        }
//        // same function
//        int count2 = 1;
//        while(true){
//            if (count2 == 6){
//                break;
//            }
//            System.out.println("Count value is " + count2);
//            count2 ++;
//        }

//        DO WHILE LOOP EXAMPLE - always have to go atleast once
//        int count3 = 1;
//        do {
//            System.out.println("Count value is " + count3);
//            count3 ++;
//        }while(count3 != 6);
//
//        PRACTICE PROBLEM
//        int number = 4;
//        int finish = 20;
//        int count = 0;
//        while(number <= finish){
//            number++;
//            if(!isEvenNumber(number)){
//                continue;
//            }
//            System.out.println("Even number " + number);
//            count++;
//            if (count >= 5){
//                break;
//            }
//        }
//        System.out.println("Total number found: " + count);
        System.out.println(sumDigits(125));

        String numberAsString = "2020";
        System.out.println("number to string= " + numberAsString);

        int num = Integer.parseInt(numberAsString);
        System.out.println("number = " + num);




    }
    public static void printDayOfTheWeek (int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("This is not a valid number");

        }
    }

    public static void dayOfTheWeekChallenge (int day){
        if(day == 0){
            System.out.println("Sunday");
        }else if(day == 1){
            System.out.println("Monday");
        }else if(day == 2){
            System.out.println("Tuesday");
        }else if(day == 3){
            System.out.println("Wednesday");
        }else if(day == 4){
            System.out.println("Thursday");
        }else if(day == 5){
            System.out.println("Friday");
        }else if(day == 6){
            System.out.println("Saturday");
        }else{
            System.out.println("This is not a valid number.");
        }
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
    }

    public static boolean isLeapYear(int year){
        if (year <= 0 || year >= 10000){
            return false;
        }
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12 || year < 1 || year > 9999){
            return -1;
        }
        boolean leapYear = isLeapYear(year);
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                if (leapYear) {
                    return 29;
                } else {
                    return 28;
                }
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount *(interestRate/100));
    }

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        for (int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isOdd(int number){
        if (number < 0){
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if(start < 0 || end < 0 || start > end){
            return -1;
        }
        for(int i = start; i < end + 1; i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }

    public static int sumDigits(int number){
        int sum = 0;
        if(number < 0 || number < 10){
            return -1;
        }
        while (number > 0){
            int digits = number % 10;
            sum += digits;
            number /= 10;
        }
        return sum;

    }

}
