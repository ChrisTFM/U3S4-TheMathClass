package com.codedifferently.labs.partA;

import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {

        //Random
        Random rand = new Random();

        int random = rand.nextInt(3) + 1;
        //Picker
        if (random == 1) {
            System.out.println("Rock");
        }
        if (random == 2) {
            System.out.println("Paper");
        }
        if (random == 3) {
            System.out.println("Sisscors");
        }
    }
}
