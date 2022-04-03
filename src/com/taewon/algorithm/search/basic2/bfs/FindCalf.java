package com.taewon.algorithm.search.basic2.bfs;

import java.util.*;

/*
* BFS 기초 :  송아지 찾기1
*
* 현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다.
* 현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면
* 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.
* 송아지는 움직이지 않고 제자리에 있다.
* 현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.
* 최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.
*
* Input : 첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다.
*           직전의 좌표 점은 1부터 10,000까지이다. ex) 5 14
* Ouput : 점프의 최소횟수를 구한다. 답은 1이상이며 반드시 존재한다. ex) 3
* */
public class FindCalf {

    private static Map<Integer, Integer> map;
    private static Queue<Integer> queue;
    private static int level;
    private static int end;

    public static void main(String[] args) {
        queue = new LinkedList<>();
        map = new HashMap<>();
        level = 0;

        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        end = scanner.nextInt();
        findCalf(start);
        System.out.println(map.get(end) - 1);
    }

    public static void findCalf(int start) {
        queue.add(start);
        while(!queue.isEmpty()) {
            int size = queue.size();
            level++;
            for (int count = 0; count < size; count++) {
                int node = queue.poll();
                if (map.containsKey(node)) { continue; }
                else { map.put(node, level); }

                if (node == end) {
                    queue.clear();
                    break;
                } else if (node < end) {
                    queue.add(node + 1);
                    queue.add(node + 5);
                } else if (node > end) {
                    queue.add(node - 1);
                }
            }
        }
    }
}
