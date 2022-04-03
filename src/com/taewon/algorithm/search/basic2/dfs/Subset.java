package com.taewon.algorithm.search.basic2.dfs;

/*
* DFS 기초 - 부분집합 구하기(재귀함수)
* */
public class Subset {

    private static int num;
    private static int[] index;

    public static void DFS(int depth) {
        if (depth == num + 1) {
            for (int i = 1; i <= num; i++) {
                if (index[i] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            index[depth] = 1;
            DFS(depth + 1);
            index[depth] = 0;
            DFS(depth + 1);
        }
    }

    public static void main(String[] args) {
       num = 3;
       index = new int[num + 1];
       DFS(1);
    }
}
