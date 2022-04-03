package com.taewon.algorithm.search.basic1;

public class NodeManager {

    public Node initNode() {
        Node rootNode = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        node3.setLeftNode(node6);
        node3.setRightNode(node7);

        node2.setLeftNode(node4);
        node2.setRightNode(node5);

        rootNode.setLeftNode(node2);
        rootNode.setRightNode(node3);

        return rootNode;
    }
}
