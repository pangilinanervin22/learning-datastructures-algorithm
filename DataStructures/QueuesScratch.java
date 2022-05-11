package DataStructures;

import java.util.Stack;

public class QueuesScratch {
    //
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> reverse = new Stack<>();

    public void add(int item) {
        stack.push(item);
    }

    public int remove() {
        if (isEmpty())
            throw new IllegalStateException();

        relocateStack();
        return reverse.pop();
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        relocateStack();

        return reverse.peek();
    }

    private void relocateStack() {
        if (reverse.isEmpty())
            while (!stack.isEmpty())
                reverse.push(stack.pop());
    }

    public boolean isEmpty() {
        return stack.isEmpty() && reverse.isEmpty();
    }

    public void print() {
        for (int num : reverse)
            System.out.print(num + " ");
    }
}
