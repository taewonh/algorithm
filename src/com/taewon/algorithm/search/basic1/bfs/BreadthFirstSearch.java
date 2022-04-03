package com.taewon.algorithm.search.basic1.bfs;

import com.taewon.algorithm.search.basic1.Node;
import com.taewon.algorithm.search.basic1.NodeManager;

import java.util.LinkedList;
import java.util.Queue;

/*
 * BFS 기초 : 이진트리 레벨탐색
 * */
public class BreadthFirstSearch {

    private Queue<Node> queue;

    public static void main(String[] args) {
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        bfs.queue = new LinkedList<>();
        Node rootNode = new NodeManager().initNode();
        bfs.search(rootNode);
    }

    public void search(Node rootNode) {
        queue.add(rootNode);
        while (!queue.isEmpty()) {
            for (int count = 0; count < queue.size(); count++) {
                Node node = queue.poll();
                System.out.print(node.getData() + " ");
                if (node.getLeftNode() != null) {
                    queue.add(node.getLeftNode());
                }
                if (node.getRightNode() != null) {
                    queue.add(node.getRightNode());
                }
            }
        }
    }
}
