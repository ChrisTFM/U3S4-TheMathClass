package com.codedifferently.labs.partC;


import java.util.Scanner;
public class KeypadConversion {
    public static void main(String[] args) {
        //Scan
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Anything");
        String input = scan.nextLine();

        //Check every letter
        String finalOutput = "";
        String letter = "";
        //Ranges
        for (int i = 1; i <= input.length(); i++){
            letter = input.substring(i - 1, i);

            if (letter.equals("a")) {finalOutput = finalOutput + "2";}
            if (letter.equals("b")) {finalOutput = finalOutput + "2";}
            if (letter.equals("c")) {finalOutput = finalOutput + "2";}
            if (letter.equals("d")) {finalOutput = finalOutput + "3";}
            if (letter.equals("e")) {finalOutput = finalOutput + "3";}
            if (letter.equals("f")) {finalOutput = finalOutput + "3";}
            if (letter.equals("g")) {finalOutput = finalOutput + "4";}
            if (letter.equals("h")) {finalOutput = finalOutput + "4";}
            if (letter.equals("i")) {finalOutput = finalOutput + "4";}
            if (letter.equals("j")) {finalOutput = finalOutput + "5";}
            if (letter.equals("k")) {finalOutput = finalOutput + "5";}
            if (letter.equals("l")) {finalOutput = finalOutput + "5";}
            if (letter.equals("m")) {finalOutput = finalOutput + "6";}
            if (letter.equals("n")) {finalOutput = finalOutput + "6";}
            if (letter.equals("o")) {finalOutput = finalOutput + "6";}
            if (letter.equals("p")) {finalOutput = finalOutput + "7";}
            if (letter.equals("q")) {finalOutput = finalOutput + "7";}
            if (letter.equals("r")) {finalOutput = finalOutput + "7";}
            if (letter.equals("s")) {finalOutput = finalOutput + "7";}
            if (letter.equals("t")) {finalOutput = finalOutput + "8";}
            if (letter.equals("u")) {finalOutput = finalOutput + "8";}
            if (letter.equals("v")) {finalOutput = finalOutput + "8";}
            if (letter.equals("w")) {finalOutput = finalOutput + "9";}
            if (letter.equals("x")) {finalOutput = finalOutput + "9";}
            if (letter.equals("y")) {finalOutput = finalOutput + "9";}
            if (letter.equals("z")) {finalOutput = finalOutput + "9";}
            if (letter.equals(" ")) {finalOutput = finalOutput + "0";}
            //System.out.println(finalOutput);
            //System.out.println(letter);
            //System.out.println(i);
            }

            System.out.println(finalOutput);
    }
}
