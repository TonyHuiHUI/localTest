package leetCode;

import java.util.Stack;

class MinStack {
    Stack<Integer> stack;
    Stack<Integer> miniStack;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        miniStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (miniStack.empty() || miniStack.peek() >= x){
            miniStack.push(x);
        }
    }

    public void pop() {
        if (stack.pop().equals(miniStack.peek())){
            miniStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return miniStack.peek();
    }
}
