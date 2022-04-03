package com.taewon.algorithm.search.basic2.dfs;

/*
* DFS 기초 - 이진수 출력(재귀함수)
* */
public class BinaryRecursive {

    public static void main(String[] args) {
        binaryRecursive(30341);
    }

    public static void binaryRecursive(int num) {
        if (num == 1) {
            System.out.print(1);
            return;
        }
        int quotient = num / 2;
        int remainder = num % 2;
        binaryRecursive(quotient);
        System.out.print(remainder);
    }
}
