package LeetcodeQueue;

//https://www.naukri.com/code360/problems/deque_1170059

public class ImplementDeque {
    public class Deque {
        private int[] deque;
        private int front, rear, size, capacity;
    
        // Initialize your data structure.
        public Deque(int n) {
            capacity = n;
            deque = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }
    
        // Pushes 'X' in the front of the deque. Returns true if it gets pushed into the deque, and false otherwise.
        public boolean pushFront(int x) {
            if (isFull()) return false; // Deque is full
            
            front = (front - 1 + capacity) % capacity;
            deque[front] = x;
            size++;
            return true;
        }
    
        // Pushes 'X' in the back of the deque. Returns true if it gets pushed into the deque, and false otherwise.
        public boolean pushRear(int x) {
            if (isFull()) return false; // Deque is full
            
            rear = (rear + 1) % capacity;
            deque[rear] = x;
            size++;
            return true;
        }
    
        // Pops an element from the front of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
        public int popFront() {
            if (isEmpty()) return -1; // Deque is empty
            
            int val = deque[front];
            front = (front + 1) % capacity;
            size--;
            return val;
        }
    
        // Pops an element from the back of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
        public int popRear() {
            if (isEmpty()) return -1; // Deque is empty
            
            int val = deque[rear];
            rear = (rear - 1 + capacity) % capacity;
            size--;
            return val;
        }
    
        // Returns the first element of the deque. If the deque is empty, it returns -1.
        public int getFront() {
            if (isEmpty()) return -1; // Deque is empty
            
            return deque[front];
        }
    
        // Returns the last element of the deque. If the deque is empty, it returns -1.
        public int getRear() {
            if (isEmpty()) return -1; // Deque is empty
            
            return deque[rear];
        }
    
        // Returns true if the deque is empty. Otherwise returns false.
        public boolean isEmpty() {
            return size == 0;
        }
    
        // Returns true if the deque is full. Otherwise returns false.
        public boolean isFull() {
            return size == capacity;
        }
    }
    
    
    }
    