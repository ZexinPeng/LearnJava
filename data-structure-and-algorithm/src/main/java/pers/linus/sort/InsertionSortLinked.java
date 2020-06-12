package pers.linus.sort;

public class InsertionSortLinked implements Sort{

    private static class Node {
        final int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public void setNext(int value) {
            this.next = new Node(value);
        }

    }

    Node first = new Node(0);

    public void sort(int[] arr) {
        first.next = new Node(arr[0]);
        Node currentNode = first.next;
        for (int i = 1; i < arr.length; i++) {
            currentNode.setNext(arr[i]);
            currentNode = currentNode.next;
        }
        currentNode = first;
        Node endNode = currentNode.next.next;
        first.next.next = null;
        while (endNode != null) {
            Node nodeToInsert = endNode;
            endNode = endNode.next;
            insertInOrdered(nodeToInsert);
        }
        Node cur = first.next;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = cur.value;
            cur = cur.next;
        }
    }

    private void insertInOrdered(Node nodeToInsert) {
        Node currentNode = first.next;
        Node pre = null;
        while (currentNode != null && currentNode.value < nodeToInsert.value) {
            pre = currentNode;
            currentNode = currentNode.next;
        }
        if (pre != null) {
            nodeToInsert.next = pre.next;
            pre.next = nodeToInsert;
        }
        else {
            nodeToInsert.next = currentNode;
            first.next = nodeToInsert;
        }
    }
}
