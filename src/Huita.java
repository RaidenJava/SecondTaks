public class Huita {
    public static void main(String[] args) {
        System.out.println(doubleExpression(1.2, 1.2, 2.4));

    }

    static boolean doubleExpression(double a, double b, double c) {
        if(Math.abs((a + b) - c) <= 0.0001) ;
        return true;
    }
}
