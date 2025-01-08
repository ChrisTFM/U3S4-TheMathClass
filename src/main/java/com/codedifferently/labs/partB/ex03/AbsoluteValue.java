package com.codedifferently.labs.partB.ex03;

public class AbsoluteValue {
    public static void main(String[] args) {
        int a = - 445, b = 399, c = 33 - 212;
        int sum = a + b + c;

        if (sum < 0) {
            sum = sum * -1;
        }
        System.out.println(sum);
    }
}
