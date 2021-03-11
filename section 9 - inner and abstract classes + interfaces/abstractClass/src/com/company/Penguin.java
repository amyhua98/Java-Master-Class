package com.company;

public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Not good at this, can i go for a swim instead?");
    }
}
