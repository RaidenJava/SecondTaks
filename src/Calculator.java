public class Calculator {
    public static void main(String[] args) {
        System.out.println(priceCalculation(1.5, 10));

    }
    static double priceCalculation(double price, int count) {
        return price*count;
    }
}
