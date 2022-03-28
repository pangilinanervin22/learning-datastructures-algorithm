package SortingAlgorithm;

public class MergeSort {

    // main function
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
}
