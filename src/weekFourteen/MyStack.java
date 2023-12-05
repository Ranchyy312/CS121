package weekFourteen;

import java.util.Stack;

public class MyStack {

    void push(Stack<Integer> stack, int element){
        stack.push(element);
    }

    int pop(Stack<Integer> stack){
        int popped = stack.pop();
        return popped;
    }

    int peek(Stack<Integer> stack){
        int peeked = stack.peek();
        return peeked;
    }

    boolean isEmpty(Stack<Integer> stack){
        boolean empty = stack.empty();
        return empty;
    }


}
