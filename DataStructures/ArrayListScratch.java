package DataStructures;

public class ArrayListScratch {

    private int length;
    private int increment = 0;
    private int[] array;

    public ArrayListScratch(int length) {
        array = new int[length];
        this.length = length;
    }

    public void insert(int num) {
        if (increment == length)
            extendArray();

        array[increment++] = num;
    }

    private void extendArray() {
        int[] tempArray = new int[length * 2];

        for (int i = 0; i < array.length; i++)
            tempArray[i] = array[i];

        length = length * 2;
        array = tempArray;
    }

    public boolean search(int find) {
        for (int num : array)
            if (num == find)
                return true;

        return false;
    }

    public void remove(int index) {
        if (index < 0 || index >= increment) {
            System.out.println("Index out of bounce");
            return;
        }

        for (int i = index; i < increment; i++)
            array[i] = array[i + 1];
        increment--;
    }

    public void print() {
        System.out.println("length : " + length);
        for (int i = 0; i < increment; i++)
            System.out.println(array[i]);
    }

}
