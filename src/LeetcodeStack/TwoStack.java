package LeetcodeStack;

public class TwoStack {
    

	// Initialize TwoStack.
	private int[] items;
    private int top1;
    private int top2;
    private int size;
		
	public TwoStack(int s) {
		this.items = new int[s];
        this.top1 = 0;
        this.top2 = s - 1;
		this.size = s;

	}

	// Push in stack 1.
	public void push1(int num) {
		// Write your code here
		if(top1 > top2) return;

		items[top1] = num;
		top1++;
	}

	// Push in stack 2.
	public void push2(int num) {
		// Write your code here
		if(top1 > top2) return;

		items[top2] = num;
		top2--;
	}

	// Pop from stack 1 and return popped element.
	public int pop1() {
		// Write your code here
		if(top1 == 0) return -1;
		top1--;
		return items[top1];

	}

	// Pop from stack 2 and return popped element.
	public int pop2() {
		// Write your code here
		if (top2 < size - 1) { // Ensure Stack 2 is not empty
            top2++;
            return items[top2];
        } else {
            // Stack Underflow
            return -1;
        }
	}

}
