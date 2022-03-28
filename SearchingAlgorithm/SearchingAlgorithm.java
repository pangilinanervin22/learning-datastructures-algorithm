package SearchingAlgorithm;

public class SearchingAlgorithm {
    public static boolean linerSearch(int[] array, int search) {
        for (int num : array)
            if (search == num)
                return true;
        return false;
    }

    public static boolean binarySearchIterative(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == target || array[right] == target || array[left] == target)
                return true;

            if (target < array[middle])
                right = middle - 1;
            else
                left = middle + 1;
        }
        return false;
    }

    // main function
    public static boolean binarySearchRec(int[] array, int target) {
        return binarySearchRec(array, target, 0, array.length - 1);
    }

    // for recursive function
    private static boolean binarySearchRec(int[] array, int target, int left, int right) {
        if (right <= left)
            return false;

        System.out.println("1");
        int middle = (left + right) / 2;

        if (array[middle] == target)
            return true;

        if (target < array[middle])
            return binarySearchRec(array, target, left, middle - 1);

        return binarySearchRec(array, target, middle + 1, right);
    }

}
