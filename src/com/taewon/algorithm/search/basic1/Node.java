package com.taewon.algorithm.search.basic1;

public class Node {

    private int data;
    private Node leftNode;
    private Node RightNode;

    public Node(int data) {
        this.data = data;
    }

    public int getData() { return data; }
    public void setData(int data) { this.data = data;}
    public Node getLeftNode() { return leftNode; }
    public void setLeftNode(Node leftNode) { this.leftNode = leftNode; }
    public Node getRightNode() { return RightNode; }
    public void setRightNode(Node rightNode) { RightNode = rightNode; }
}
