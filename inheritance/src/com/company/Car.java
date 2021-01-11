package com.company;

public class Car extends Vehicle{
    private int wheels;
    private int seats;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int currentVelocity, int currentDirection, int wheels, int seats, int gears, boolean isManual, int currentGear) {
        super(name, size, currentVelocity, currentDirection);
        this.wheels = wheels;
        this.seats = seats;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): changed to" + currentGear);
    }

    public void changeVelocity(int speed, int direction){
        move(speed, direction);
        System.out.println("Car.changeVelocity(): changed to" + currentGear + " in direction of "+ direction + " degrees");
    }

}
