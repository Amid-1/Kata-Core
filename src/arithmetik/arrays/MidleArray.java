package arithmetik.arrays;

public class MidleArray {

    public static void main(String[] args) {
        int[] numbers1 = {1, 5, 2, 17};
        int[] numbers2 = {14, 16, 3};
        int[] numbers3 = {};

        int[] result1 = getArrayMiddl(numbers1);
        int[] result2 = getArrayMiddl(numbers2);
        int[] result3 = getArrayMiddl(numbers3);

        System.out.println("Result 1: " + result1[0] + " " + result1[1]);
        System.out.println("Result 2: " + result2[0]);
        System.out.println("Result 3: " + result3.length);

    }

    public static int[] getArrayMiddl(int[] numbers) {
        if (numbers.length == 0) {
            return new int[0];
        }

        if (numbers.length % 2 == 0) {
            return new int[]{numbers[numbers.length / 2 - 1], numbers[numbers.length / 2]};
        } else {
            return new int[]{numbers[numbers.length / 2]};
        }
    }
}