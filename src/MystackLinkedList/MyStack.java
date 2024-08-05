package MystackLinkedList;

import java.util.EmptyStackException;

class Node {
    public int data;
    public Node next = null;

    public Node(int data) {
        this.data = data;}
}

public class MyStack {
    private Node head;
    private int size;

    public MyStack() {
        this.head = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public int pop() {
        if (head == null) {
            throw new EmptyStackException(); // Stack Underflow
        }

        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public int peak() {
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return head.data;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.data).append("\n");
            current = current.next;
        }
        return sb.toString();
    }
}
