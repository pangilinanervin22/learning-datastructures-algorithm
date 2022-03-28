package SortingAlgorithm;

// ! all for int array only
public class SortingAlgorithm {

    // sample unsort array
    public static int[] unSortArray = { 4, 1, 3, 5, 2, 7, 9, 6, 10, 8 };

    // for swapping array value
    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    swap(array, i, j);
                }
            }
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int lowestIndex = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[lowestIndex])
                    lowestIndex = j;
            swap(array, lowestIndex, i);
        }
    }

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

    public static void mergeSort(int[] array) {
        if (array.length < 2)
            return;

        int middle = array.length / 2;

        int[] left = new int[middle];
        for (int i = 0; i < middle; i++)
            left[i] = array[i];

        int[] right = new int[array.length - middle];
        for (int i = middle; i < array.length; i++)
            right[i - middle] = array[i];

        mergeSort(left);
        mergeSort(right);

        merge(left, right, array);
    }

    // for recursion function
    private static void merge(int[] left, int[] right, int[] sortArray) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                sortArray[k++] = left[i++];
            else
                sortArray[k++] = right[j++];
        }
        while (i < left.length)
            sortArray[k++] = left[i++];

        while (j < right.length)
            sortArray[k++] = right[j++];
    }

    public static void QuickSort(int[] array) {
        QuickSort.quickSort(array);
    }

    private static class QuickSort {
        private static void quickSort(int[] array) {
            quickSort(array, 0, array.length - 1);
        }

        // for recursion function
        private static void quickSort(int[] array, int start, int end) {
            if (start >= end)
                return;

            int boundary = partition(array, start, end);

            quickSort(array, start, boundary - 1);
            quickSort(array, boundary + 1, end);
        }

        // swapping beyond pivot
        private static int partition(int[] array, int start, int end) {
            int pivot = array[end];
            int boundary = start - 1;
            for (int i = start; i <= end; i++)
                if (array[i] <= pivot)
                    swap(array, i, ++boundary);

            return boundary;
        }
    }

    public static void CountingSort(int[] array, int biggestValue) {
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
