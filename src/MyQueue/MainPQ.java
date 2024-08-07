package MyQueue;

public class MainPQ {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue(10);
        queue.enqueue(1);
        queue.enqueue(9);
        queue.enqueue(11);
        queue.enqueue(3);
        queue.enqueue(3);
        queue.enqueue(12);
        
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue);
        
        queue.enqueue(10);
        queue.enqueue(102);
        queue.enqueue(130);
        queue.enqueue(-10);
        queue.enqueue(-102);
        queue.enqueue(-130);

        System.out.println(queue);

        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        
        
        }

}
