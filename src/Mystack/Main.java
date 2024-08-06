package MyStack;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.pop();

        System.out.println(stack.peak());
        System.out.println();

        System.out.println(stack.isEmpty());

        System.out.println(stack.size());
        System.out.println(stack);
        

    }
}
