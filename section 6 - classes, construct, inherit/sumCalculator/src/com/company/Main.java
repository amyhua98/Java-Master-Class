package com.company;

public class Main {

    public static void main(String[] args) {
	    SimpleCalculator calc = new SimpleCalculator();
	    calc.getFirstNumber();
        calc.getSecondNumber();

        calc.setFirstNumber(6);
        calc.setSecondNumber(2);

        calc.getAdditionResult();
        calc.getSubtractionResult();
        calc.getMultiplicationResult();
        calc.getDivisionResult();
    }
}
