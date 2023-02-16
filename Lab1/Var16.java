package Lab1;

public class Var16 {
    public static void main(String[] args) {
        int[][] pairs = { { 12, 8 }, { 15, 20 }, { 30, 45 }, { 64, 128 } };

        for (int i = 0; i < pairs.length; i++) {
            int a = pairs[i][0];
            int b = pairs[i][1];
            int pgcd = getPGCD(a, b);
            System.out.println("НОД " + a + " и " + b + " равен : " + pgcd);
        }
    }

    public static int getPGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
