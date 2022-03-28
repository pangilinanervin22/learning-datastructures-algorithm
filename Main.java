
import java.util.Arrays;
import java.util.Scanner;

import SearchingAlgorithm.SearchingAlgorithm;
import SortingAlgorithm.SortingAlgorithm;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean findValue;

        int[] arrSample = { 4, 1, 3, 5, 2, 7, 9, 6, 10, 8 };
        findValue = SearchingAlgorithm.linerSearch(arrSample, 5);
        System.out.println(findValue);

        int[] sortArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        findValue = SearchingAlgorithm.binarySearchIterative(sortArray, 5);
        System.out.println(findValue);

        // Sorting Algorithm
        int[] unSortArray = { 4, 1, 3, 5, 2, 7, 9, 6, 10, 8 };
        SortingAlgorithm.quickSort(unSortArray);
        System.out.println(Arrays.toString(unSortArray));

        unSortArray = SortingAlgorithm.getUnSortedArray;
        SortingAlgorithm.mergeSort(unSortArray);
        System.out.println(Arrays.toString(unSortArray));
    }

}
