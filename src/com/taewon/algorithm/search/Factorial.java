package com.taewon.algorithm.search;

public class Factorial {

    public static void main(String[] args) {
        int result = factorial(10);
        System.out.println(result);
    }

    private static int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
