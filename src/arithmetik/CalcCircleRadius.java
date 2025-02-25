package arithmetik;

public class CalcCircleRadius {
    public static void main(String[] args) {
        CalcCircleRadius calcCircleRadius = new CalcCircleRadius();
        double area = 123;
        double radius = calcCircleRadius.calcCircleRadius(area);
        System.out.printf("%.3f%n", radius);
    }

    public static double calcCircleRadius(double area) {
        return Math.sqrt(area / Math.PI);
    }
}
