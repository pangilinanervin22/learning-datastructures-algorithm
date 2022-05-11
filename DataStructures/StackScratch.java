package DataStructures;

import java.util.Arrays;

public class StackScartch {
    private int[] items = new int[10];
    private int index;

    public void push(int input) {
        items[index++] = input;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("your stack have no items");
            return 0;
        }
        return items[index--];
    }

    public int peek() {
        if (isEmpty())
            return 0;
        return items[index];
    }

    public boolean isEmpty() {
        return index == 0;
    }

    @Override
    public String toString() {
        int[] current = Arrays.copyOfRange(items, 0, index);
        return Arrays.toString(current);
    }

}
