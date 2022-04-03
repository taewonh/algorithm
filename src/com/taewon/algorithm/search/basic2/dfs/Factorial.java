package com.taewon.algorithm.search.basic2.dfs;

/*
* DFS 기초 - 팩토리얼(재귀함수)
* */
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
