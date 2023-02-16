package Lab1;

public class Var21 {
    public static void main(String[] args) {
        for (int x = -10; x <= 10; x++) {
            double y = calculateY(x);
            System.out.println("f(" + x + ") = " + y);
        }
    }

    public static double calculateY(int x) {
        double y = 0;

        if (x >= -5 && x <= 5) {
            y = Math.pow(x, 2);
        } else if (x < -5) {
            y = 2 * Math.abs(x) - 1;
        } else {
            y = 2 * x;
        }

        return y;
    }
}
