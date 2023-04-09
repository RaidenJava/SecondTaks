import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {

        System.out.println(drawisMonitorsCounter(12, 5));
        System.out.println(Govno.egor(10, 10));

    }

    static int drawisMonitorsCounter(int monitors, int programmers) {
        return monitors % programmers;
    }

    static class Govno {
        static int egor(int s, int e) {
            return s - e;
        }
    }
}











