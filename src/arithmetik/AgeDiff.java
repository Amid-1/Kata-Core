package arithmetik;

public class AgeDiff {
    public static void main(String[] args) {
        System.out.println(getAgeDiff(20, 10));
    }

    public static byte getAgeDiff(int a, int b) {
        return (byte) ((byte) a - b);
    }
}
