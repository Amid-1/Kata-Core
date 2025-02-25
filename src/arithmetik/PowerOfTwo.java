package arithmetik;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(10));
    }

    public static boolean isPowerOfTwo(int n) {
        n = Math.abs(n);
        if (n == 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
