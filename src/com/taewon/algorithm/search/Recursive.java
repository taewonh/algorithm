package com.taewon.algorithm.search;

/*
* DFS, BFS 기초 - 재귀함수(스택프레임)
* */
public class Recursive {

    public static void main(String[] args) {
        recursive(3);
    }

    public static void recursive(int num) {
        if (num == 0) {
            return;
        }
        recursive(num - 1);
        System.out.println(num + " ");
    }
}
