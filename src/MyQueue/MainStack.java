package MyQueue;

public class MainStack {
    public static void main(String[] args) {
        MyQueueStack queue = new MyQueueStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        
        }
}
