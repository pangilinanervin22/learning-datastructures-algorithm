
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import SearchingAlgorithm.SearchingAlgorithm;
import SortingAlgorithm.SortingAlgorithm;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean findValue;

        int[] unSortArray = { 4, 1, 3, 5, 2, 7, 9, 6, 10, 8 };
        int[] sortArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // * best way to find a value in a unsorted array
        // * TIME = best 0(1) / worst o(n)
        findValue = SearchingAlgorithm.linerSearch(unSortArray, 5);
        System.out.println(findValue);

        // ! array must be sorted
        // * Time o(log n)
        findValue = SearchingAlgorithm.binarySearchIterative(sortArray, 5);
        System.out.println(findValue);

        // QuickSort
        // Time - best o(n log n) / worst o(n)
        // Partitioning = Space - best o(log n) / worst o(n)
        SortingAlgorithm.QuickSort(unSortArray);
        System.out.println(Arrays.toString(unSortArray));

    }

}
