package weekFourteen;

import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(3);
        array.add(5);
        array.add(8);
        Stack<Integer> stack = new Stack<>();
        stack.addAll(array);

        MyStack st = new MyStack();
        st.push(stack,4);
        System.out.println("Popped: "+st.pop(stack));
        System.out.println("Peeked: "+st.peek(stack));
        System.out.println("Stack is Empty: "+st.isEmpty(stack));
    }
}
