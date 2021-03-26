package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Staffy");
        dog.eat();
        dog.breathe();

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.eat();
        parrot.breathe();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();



    }


}
