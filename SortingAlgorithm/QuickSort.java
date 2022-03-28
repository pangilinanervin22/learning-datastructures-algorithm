package SortingAlgorithm;

public class QuickSort {

    // main function
    public static void quickSort(int[] array) {
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

    // for swapping array value
    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
