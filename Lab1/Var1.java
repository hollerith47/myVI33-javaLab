package Lab1;

public class Var1 {
    public static void main(String[] args) {
        int[] x = { 1, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95 };
        int[] y = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30 };

//        System.out.println(x.length);
//        System.out.println(y.length);
        double z = CalculateZ(x, y);
        String result = Double.toString(z);
        System.out.println(" Z = " + result.substring(0, 4));
//        System.out.println(" Z = " + z);
//        System.out.println(" Z =" + String.format("%.2", z));




    }
    public static double CalculateZ(int[] x, int[] y){
        int max_x = findMax(x);
        int max_y = findMax(y);
        double z;

        z = (Math.exp(max_x) - Math.exp(max_y))/ Math.sqrt(Math.abs(max_x * max_y));

        return z;

    }

    public static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
