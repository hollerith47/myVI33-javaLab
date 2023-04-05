package Lab1_1;

public class var13 {
    public static void main(String[] args) {
        double[] x = {0.0, 1.0, 1.0, 0.0};
        double[] y = {1.0, 0.0, 1.0, 1.0};
        double area = calculTriAria(x, y);
        System.out.println("Площадь многоугольника:" + area);
    }

    // Метод для расчета площади многоугольника
    public static double calculTriAria(double[] x, double[] y) {
        int n = x.length;
        double area = 0.0;
        // Используем формулу Гаусса для расчета площади многоугольника
        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            area += x[i] * y[j] - y[i] * x[j];
        }
        area /= 2.0;
        return Math.abs(area);
    }
}
