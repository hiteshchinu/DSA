package MyQueue;

import java.util.Arrays;

public class MyPriorityQueue {
    private int[] items;
    private int front;
    private int rear;
    private int size;
    private int count;

    public MyPriorityQueue(int capacity) {
        this.items = new int[capacity];
        this.front = -1;
        this.rear = 0;
        this.size = capacity;
        this.count = 0;
    }


    public void enqueue(int val){
        if (count == size) {
            System.out.println("Queue is full");
            return;
        }

        int i = 0;
        for(i = rear; i > 0; i--){
            if (items[i - 1] <= val) {
                break;
            }
            if(items[i-1] > val){
                items[i] = items[i - 1];
            }
        }

        items[i] = val;
        rear =  (rear + 1) % size;
        count++;
    }

    
    public int dequeue(){
        
        if (count == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        front = (front + 1) % size; 
        int val = items[front];
        items[front] = 0;
        count--;
        return val;
    }



    public String toString(){
        return Arrays.toString(items);
    }
}
