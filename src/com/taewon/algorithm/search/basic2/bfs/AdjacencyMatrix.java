package com.taewon.algorithm.search.basic2.bfs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
* DFS 기초 : 인접행렬 경로탐색(DFS)
*
* 방향그래프가 주어지면 1번 정점에서 N번 정점으로 가는 모든 경로의
* 가지 수를 출력하는 프로그램을 작성하세요.
* 아래 그래프(그래프는 생략) 에서 1번 정점에서 5번 정점으로 가는 가지 수는
*
* 1 2 3 4 5
* 1 2 5
* 1 3 4 2 5
* 1 3 4 5
* 1 4 2 5
* 1 4 5
*
* 총 6가지 입니다.
*
* Input: 첫째 줄에는 정점의 수 N(1<=N<=20)와 간선의 수 M가 주어진다.
* 그 다음부터 M 줄에 걸쳐 연결 정보가 주어진다.
*
* Output: 1번 정점에서 5번 정점으로 가는 가지 수
* */
public class AdjacencyMatrix {

    private Scanner scanner;
    private int[][] matrix;
    private int vertexCount;
    private int linkCount;
    private Set<Integer> memory;
    private int result;

    public static void main(String[] args) {
        AdjacencyMatrix matrix = new AdjacencyMatrix();
        matrix.init();
        matrix.initGraph();
        matrix.createLink();
//        matrix.printMatirix();
        matrix.dfs(1);
        System.out.println(matrix.result);
    }

    private void init() {
        scanner = new Scanner(System.in);
        vertexCount = scanner.nextInt();
        linkCount = scanner.nextInt();
        result = 0;
    }

    private void initGraph() {
        matrix = new int[vertexCount + 1][vertexCount + 1];
        for (int row = 0; row < vertexCount + 1; row++) {
            for (int col = 0; col < vertexCount + 1; col++) {
                matrix[row][col] = 0;
            }
        }
    }

    private void createLink() {
        for(int index = 0; index < linkCount; index++) {
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            matrix[source][destination] = 1;
        }
    }

    private void printMatirix() {
        for (int row = 1; row < vertexCount + 1; row++) {
            for (int col = 1; col < vertexCount + 1; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private void dfs(int source) {
        if (source == vertexCount) {
            result++;
        } else {
            for (int destination = 1; destination < vertexCount + 1; destination++) {
                if (source == 1) {
                    memory = new HashSet<>();
                }
                memory.add(source);
                if (matrix[source][destination] == 1 && !memory.contains(destination)) {
                    dfs(destination);
                }
            }
        }
    }
}
