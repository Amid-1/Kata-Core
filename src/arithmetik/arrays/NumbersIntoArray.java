package arithmetik.arrays;

public class NumbersIntoArray {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 9, 11, 24};
        int[] result = getSubArrayBetween(numbers, 5, 10);

        System.out.println("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                numbers[j++] = numbers[i];
            }
        }
        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = numbers[i];
        }
        return result;
    }
}