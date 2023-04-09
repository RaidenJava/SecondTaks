public class Products {
    public static void main(String[] args) {
        System.out.println(priceCalculation(2.6, 4));
    }

    static double priceCalculation(double price, int count) {
        return price * count;
    }
}
