package com.taewon.algorithm.search.basic1.dfs;

import com.taewon.algorithm.search.basic1.Node;
import com.taewon.algorithm.search.basic1.NodeManager;

/*
* DFS 기초 : 이진트리순회(전위, 중위, 후위순회)
* */
public class DepthFirstSearch {

    public static void main(String[] args) {
        Node rootNode = new NodeManager().initNode();

        //전위순회
        System.out.print("전위순회 : ");
        preOrder(rootNode);
        System.out.println();

        System.out.print("중위순회 : ");
        inOrder(rootNode);
        System.out.println();

        System.out.print("후위순회 : ");
        postOrder(rootNode);
        System.out.println();
    }

    private static void postOrder(Node node) {
        if (node.getLeftNode() != null) {
            postOrder(node.getLeftNode());
        }
        if (node.getRightNode() != null) {
            postOrder(node.getRightNode());
        }
        System.out.print(node.getData() + " ");
    }
    
    private static void inOrder(Node node) {
        if (node.getLeftNode() != null) {
            inOrder(node.getLeftNode());
        }
        System.out.print(node.getData() + " ");
        if (node.getRightNode() != null) {
            inOrder(node.getRightNode());
        }
    }

    private static void preOrder(Node node) {
        System.out.print(node.getData() + " ");
        if (node.getLeftNode() != null) {
            preOrder(node.getLeftNode());
        }
        if (node.getRightNode() != null) {
            preOrder(node.getRightNode());
        }
    }
}
