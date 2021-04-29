package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> famous = new Team<>("Famous");
        famous.addPlayer(joe);
//        famous.addPlayer(pat);
//        famous.addPlayer(beckham);

        System.out.println(famous.numPlayers());


        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        //Compiles but error at runtime, needs to add <T extends Player> in Team.java
//        Team<String> brokenTeam = new Team<>("cant work");
//        brokenTeam.addPlayer("no-one");

        Team<SoccerPlayer> soccerTeam = new Team<>("Manchester United");
        soccerTeam.addPlayer(beckham);

//	    ArrayList items = new ArrayList();
//	    items.add(1);
//        items.add(2);
//        items.add(3);
//        items.add(4);
//        items.add(5);
//
//        printDoubled(items);
    }

//    private static void printDoubled(ArrayList n){
//        for (Object i : n){
//            System.out.println((Integer) i * 2);
//        }
//    }
}
