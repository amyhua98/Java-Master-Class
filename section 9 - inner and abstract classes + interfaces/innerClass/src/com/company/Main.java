package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
        Gearbox.Gear first = mcLaren.new Gear(1,12.3);
//        error bc Gearbox was not created first
//        Gearbox.Gear second = new Gearbox.Gear(2,15.4);
//        error bc you format is incorrect
//        Gearbox.Gear third = new mcLaren.Gear(3,17.3);
        System.out.println(first.driveSpeed(1000));
    }
}
