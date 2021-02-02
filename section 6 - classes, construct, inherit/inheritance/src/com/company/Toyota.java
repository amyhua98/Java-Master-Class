package com.company;

public class Toyota extends Car{
    private int roadServiceMonths;


    public Toyota(String name, String size, int currentVelocity, int currentDirection, int wheels, int seats, int gears, boolean isManual, int currentGear, int roadServiceMonths) {
        super("Corolla", "4WD", 5, 5, 4, 4, 4, true, currentGear);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
        }else if( newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        }else if( newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        }else if( newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
        }else{
            changeGear(4);
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }




}
