package com.taewon.algorithm.search.basic;

/*
* DFS, BFS 기초 - 재귀함수(스택프레임)
* 1부터 입력받은 수까지 출력
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
