package DataStructures;

import java.util.Arrays;

public class PriorityQueueScratch {
    private int[] items = new int[5];
    private int count;

    public void add(int input) {
        // resize the array
        if (count == items.length)
            resize();

        // shifting items
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (items[i] > input) {
                items[i + 1] = items[i];
            } else
                break;
        }
        items[i + 1] = input;
        count++;
    }

    public int remove() {
        if (isEmpty())
            System.out.println("nothing to remove");

        return items[--count];
    }

    //
    // public int peek() {
    // }

    public void resize() {
        int[] tempArray = new int[items.length * 2];
        int current = 0;
        for (int num : items) {
            tempArray[current] = num;
            current++;
        }
        items = tempArray;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

}
