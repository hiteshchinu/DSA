package LeetcodeStack;

import java.util.Stack;
// https://www.naukri.com/code360/problems/insert-an-element-at-its-bottom-in-a-given-stack_1171166
public class InsertAnElementAtItsBottomInAGivenStack {

    public class Solution 
{
  public static Stack<Integer> pushAtBottom(Stack <Integer> myStack, int x) 
  {
    if (myStack.isEmpty()) {
            myStack.push(x);
            return myStack;
        }
        int top = myStack.pop();
        pushAtBottom(myStack, x);
        myStack.push(top);
        return myStack;
  }
}

}
