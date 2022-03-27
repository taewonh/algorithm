package com.taewon.algorithm.search.basic;

public class DepthFirstSearch {

    public static class Node {
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

    public static void main(String[] args) {
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
