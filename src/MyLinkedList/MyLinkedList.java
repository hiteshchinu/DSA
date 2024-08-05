package MyLinkedList;

class Node {
    public int data;
    public Node next = null;

    public Node(int data) {
        this.data = data;}
}

public class MyLinkedList {
    private Node head;
    private Node tail;

    public MyLinkedList(){
        head = null;
        tail = null;
    }




    public void insert(int value) {
        Node node = new Node(value);
        node.data = value;

        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.next = node;
            tail =  node;
        }
    }

    // i just did by overloading if no index is given in insert then it inserts at the end or it inserts in the given index

    public void insert(int index, int value) {
        Node node = new Node(value);
        Node current = head;
        int i = 0;
        while (i < index - 1) {
            current = current.next;
            i++;
        }
        node.next = current.next;
        current.next = node;
    }


    public void insertFirst(int value){
        Node node = new Node(value);
        if(isEmpty()){
            insert(value);
            return;
        }
        node.next = head;
        head = node;
    }

    public boolean isEmpty(){
        return head == null && tail == null ;
    }
    




    public int sum(){
        Node current = head;
        int sum = 0;
        while (current != null) {
            sum += current.data;
            current = current.next;
        }
        return sum;
    }



    public int indexOf(int value) {
        int index = 0;
        Node current = head;
        while (current != null) {
            if (current.data == value) return index;
            index++;
            current = current.next;
        }
        return -1;
    }





    public void reverse() {
        if(head == null) return;

        Node prev = null;
        Node current = head;
        Node next = head.next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        tail = head;
        head = prev;
    }


    public Node reverseRecursive(Node head){
        if (head == null || head.next == null) return head;

        Node rest = reverseRecursive(head.next);

        Node next = head.next;
        next.next = head;
        head.next = null;
        
        return rest;
    }

    public void reverseRecursive(){
        head = reverseRecursive(head);
    }





    public void removeStart(){
        if(isEmpty()) return;
        Node temp = head;
        head = head.next;
        temp.next = null;
    }

    public void removeEnd(){
        if(isEmpty()) return;
        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }
        current.next = null;
        tail = current;
    }



    public void removeNthFromTheEnd(int n) {
        if (isEmpty()) return;
    
        // Initialize two pointers, main and ref, to the head of the list
        Node main = head;
        Node ref = head;
    
        // Move the ref pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (ref == null) return; // n is larger than the list size
            ref = ref.next;
        }
    
        // If ref is null, it means we need to remove the head node
        if (ref == null) {
            head = head.next;
            return;
        }
    
        // Move both pointers one step at a time until ref reaches the end
        while (ref.next != null) {
            main = main.next;
            ref = ref.next;
        }
    
        // Remove the nth node from the end
        main.next = main.next.next;
    }

    public String toString() {
        StringBuilder nodeString = new StringBuilder();
        Node traversingNode = head; // > Traversing from start
        while (traversingNode != null) {
            nodeString.append(traversingNode.data);
            if(traversingNode.next != null){
                nodeString.append(" --> ");
            }
            traversingNode = traversingNode.next;
        }
        return nodeString.toString();

    }





    public void printRec(Node head){
        if (head == null) return;
        System.out.print(head.data + " ");
        printRec(head.next);
    }

    public void printRec(){
        printRec(head);
    }
}
