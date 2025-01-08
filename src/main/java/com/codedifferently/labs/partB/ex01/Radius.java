package com.codedifferently.labs.partB.ex01;
import java.util.Scanner;
public class Radius {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Input Radius Of Your Circle");
        Integer input = scan.nextInt();

        String finalValue = String.valueOf(3.14 * input * input);
        System.out.println("Area: " + finalValue);
    }


}
