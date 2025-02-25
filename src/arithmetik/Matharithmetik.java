package arithmetik;

public class Matharithmetik {
    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs((a * b) - c) < 0.0001;}

    public static void main(String[] args) {
        System.out.println(doubleExpression(1, 2, 3));
    }
}
