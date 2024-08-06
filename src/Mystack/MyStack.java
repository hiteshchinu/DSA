package MyStack;

import java.util.EmptyStackException;

public class MyStack {
    private int[] items;
    private int top;
    private int size;

    public MyStack(int size) {
        this.size = size;
        this.items = new int[size];
        this.top = 0;
    }


    public int size(){
        return top;
    }
    
    public int pop(){

        if(top == 0){
            // System.out.println("Stack is empty");
            // return -1;
            throw new EmptyStackException(); //Stack Underflow
        }

        top--;
        int value = items[top];
        items[top] = 0;
        return value;
    }

    public int peak(){
        if(top == 0){
            System.out.println("Stack is empty");
            return -1;
        }
        return items[top - 1];
    }


    public void push(int value){
        if(top == size){
            //System.out.println("Stack is full");
            // return;
            throw new StackOverflowError();
        }
        this.items[this.top] = value;
        this.top++;
    }



    public boolean  isEmpty(){
        return top == 0;
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = size - 1; i >= 0;i--){
            sb.append(this.items[i]).append("\n");
        }
        return sb.toString();
    }





}
