package arithmetik.arrays;

import java.util.Arrays;

public class MergeAndSortt {
    public static void main(String[] args) {
        int[] firstArray = {16, 33, 4, 12, 1, 75, 5, 14, 8, 112};
        int[] secondArray = {23, 11, 6, 3, 9, 10, 2};

        int[] mergedAndSortedArray = mergeAndSortt(firstArray, secondArray);
        System.out.println(Arrays.toString(mergedAndSortedArray));
    }

    public static int[] mergeAndSortt(int[] firstArray, int[] secondArray) {
        int[] mergedArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            mergedArray[i] = firstArray[i];
        }
        for (int i = 0; i < secondArray.length; i++) {
            mergedArray[firstArray.length + i] = secondArray[i];
        }

        int[] sortedArray = new int[mergedArray.length];
        for (int i = 0; i < mergedArray.length; i++) {
            sortedArray[i] = mergedArray[i];
        }
        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[i] > sortedArray[j]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;
    }
}

// public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
//    int[] mergedArray = new int[firstArray.length + secondArray.length];
//
//    int k = 0;
//    for (int i = 0; i < firstArray.length; i++) {
//        mergedArray[k++] = firstArray[i];
//    }
//    for (int i = 0; i < secondArray.length; i++) {
//        mergedArray[k++] = secondArray[i];
//    }
//
//    boolean sorted = false;
//    while (!sorted) {
//        sorted = true;
//        for (int i = 0; i < mergedArray.length - 1; i++) {
//            if (mergedArray[i] > mergedArray[i + 1]) {
//                int temp = mergedArray[i];
//                mergedArray[i] = mergedArray[i + 1];
//                mergedArray[i + 1] = temp;
//                sorted = false;
//            }
//        }
//    }
//
//    return mergedArray;
//}
