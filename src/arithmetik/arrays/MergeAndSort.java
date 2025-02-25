package arithmetik.arrays;

import java.util.Arrays;

public class MergeAndSort {

    public static void main(String[] args) {
        int[] firstArray = {16, 33, 4, 12, 1, 75, 5, 14, 8, 112};
        int[] secondArray = {23, 11, 6, 3, 9, 10, 2};

        int[] mergedAndSortedArray = mergeAndSort(firstArray, secondArray);
        System.out.println(Arrays.toString(mergedAndSortedArray));
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] mergedArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, mergedArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, mergedArray, firstArray.length, secondArray.length);

        int[] sortedArray = Arrays.copyOf(mergedArray, mergedArray.length);
        Arrays.sort(sortedArray);
        return sortedArray;
    }
}
