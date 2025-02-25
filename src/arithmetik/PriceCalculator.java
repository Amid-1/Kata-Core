package arithmetik;

public class PriceCalculator {
    public double priceCalculation(double price, int count) {
        return price * count;
    }

    public static void main(String[] args) {
        PriceCalculator priceCalculator = new PriceCalculator();
        double price = 8.50;
        int count = 2;

        double total = priceCalculator.priceCalculation(price, count);
        System.out.println(total);
    }
}
