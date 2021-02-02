package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "Daniel";
        int score = 1500;
        displayHighScorePosition(name, calculateHighScorePosition(score));

        name = "Andrea";
        score = 900;
        displayHighScorePosition(name, calculateHighScorePosition(score));

        name = "Heather";
        score = 400;
        displayHighScorePosition(name, calculateHighScorePosition(score));

        name = "Phillis";
        score = 50;
        displayHighScorePosition(name, calculateHighScorePosition(score));

        name = "test";
        score = 100;
        displayHighScorePosition(name, calculateHighScorePosition(score));
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println("Player " + name + " managed to get into position " + position + " on " +
                "the high score table.");
    }

    public static int calculateHighScorePosition(int score) {

//        if (score >= 1000) {
//            return 1;
//        } else if (score >=500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }
        int position = 4; //assuming position 4 will be returned

        if(score >= 1000) {
            position = 1;
        } else if(score >= 500) {
            position = 2;
        } else if(score >= 100) {
            position =3;
        }
        return position;
    }
}
