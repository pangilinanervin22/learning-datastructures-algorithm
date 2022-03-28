package SortingAlgorithm;

// ! all for int array only
public class SortingAlgorithm {

    // sample unsorted array
    public static int[] getUnSortedArray = { 4, 1, 3, 5, 2, 7, 9, 6, 10, 8 };

    // for swapping array value
    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    // Time - best o(n) / worst o(n²)
    // pass and compare principle
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    swap(array, i, j);
                }
            }
        }
    }

    // Time - best o(n²) / worst o(n²)
    // select smallest then swap (slowest that I remember)
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int lowestIndex = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[lowestIndex])
                    lowestIndex = j;
            swap(array, lowestIndex, i);
        }
    }

    // Time- best o(n) | worst o(n²)
    // iteration and shifting
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

    // Time - best o(n log n) / worst o(n log n)
    // space 0(n) divide and merge principle
    public static void mergeSort(int[] array) {
        MergeSort.mergeSort(array);
    }

    // Time - best o(n log n) / worst o(n)
    // partitioning
    // Space - best o(log n) / worst o(n)
    // Generally fastest sorting algorithm
    public static void quickSort(int[] array) {
        QuickSort.quickSort(array);
    }

    // Time- best o(n) / worst o(n)
    // Space - o(k)
    // fastest if sorting talking about number but worst space complexity
    public static void countingSort(int[] array, int biggestValue) {
        int[] numCount = new int[biggestValue + 2];
        for (int num : array) {
            numCount[num]++;
        }

        int current = 0;
        for (int i = 0; i < numCount.length - 1; i++) {
            for (int j = 0; j < numCount[i]; j++) {
                array[current++] = i;
            }
        }

    }
}
