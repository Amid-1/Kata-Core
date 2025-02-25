package arithmetik.arrays;

import java.util.Arrays;

public class InverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] reversed = inverseArray(numbers);
        System.out.println(Arrays.toString(reversed));
    }

    public static int[] inverseArray(int[] numbers) {
        int[] reversed = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - 1 - i];
        }
        return reversed;
    }
}
