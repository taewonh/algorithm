package com.taewon.algorithm.search;

public class Fibonacci {

    public static void main(String[] args) {
        int num = 7;
        for (int count = 1; count <= num; count++) {
            System.out.print(fibonacci(count) + " ");
        }
    }

    private static int fibonacci(int num) {
        if (num == 1) { return 1; }
        else if (num == 2) { return 1; }
        else {
            return fibonacci(num - 2) + fibonacci(num - 1);
        }
    }
}
