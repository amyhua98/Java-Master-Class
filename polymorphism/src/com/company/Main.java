package com.company;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats a lot of people";
    }
}

class Independence extends Movie{
    public Independence() {
        super("Independence");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet";
    }
}

class MazeRunner extends Movie{
    public MazeRunner() {
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }
}

class StarWars extends Movie{
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Baby Yoda is grown.";
    }
}

class Forgetable extends Movie{
    public Forgetable() {
        super("Forgetable");
    }


}

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static randomMovie(){
        int randomNum = (int)(Math.random() * 5) + 1;
        System.out.println();
    }
}
