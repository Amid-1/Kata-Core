package arithmetik.arrays;

import java.util.Arrays;

public class GetArrayMiddle {
    public static void main(String[] args) {
        int[] numbers1 = {1, 5, 2, 17};
        int[] numbers2 = {14, 16, 3};
        int[] numbers3 = {};

        int[] result1 = getArrayMiddle(numbers1);
        int[] result2 = getArrayMiddle(numbers2);
        int[] result3 = getArrayMiddle(numbers3);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }

    public static int[] getArrayMiddle(int[] numbers) {
//        return (numbers == null || numbers.length == 0) ? new int[0] :
//                (numbers.length % 2 == 0) ? new int[]{numbers[numbers.length / 2 - 1],
//                        numbers[numbers.length / 2]} : new int[]{numbers[numbers.length / 2]};
        return (numbers == null || numbers.length == 0) ? new int[0] :
                Arrays.copyOfRange(numbers, (numbers.length - 1) / 2, (numbers.length / 2) + 1);

    }
}
