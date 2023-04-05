package Lab1_1;

public class var12 {
    public static void main(String[] args) {
        double[][] points = {{0.1, 0.2}, {0.3, 0.4}, {0.5, 0.6}, {0.7, 0.8}};
        double[] minSumPoint = findMinSumDistancePoint(points);
        System.out.println("Точка с минимальной суммой расстояний: (" + minSumPoint[0] + ", " + minSumPoint[1] + ")");
    }

    public static double[] findMinSumDistancePoint(double[][] points) {
        int n = points.length;
        double[] minSumPoint = new double[2];
        double minSumDistance = Double.POSITIVE_INFINITY;
        // Перебираем все точки на плоскости
        for (double x = 0.0; x <= 1.0; x += 0.01) {
            for (double y = 0.0; y <= 1.0; y += 0.01) {
                double sumDistance = 0.0;
                // Вычисляем сумму расстояний от текущей точки до остальных точек
                for (int i = 0; i < n; i++) {
                    double dx = points[i][0] - x;
                    double dy = points[i][1] - y;
                    sumDistance += Math.sqrt(dx * dx + dy * dy);
                }
                // Если сумма расстояний меньше минимальной, то обновляем минимальную сумму и координаты точки
                if (sumDistance < minSumDistance) {
                    minSumDistance = sumDistance;
                    minSumPoint[0] = x;
                    minSumPoint[1] = y;
                }
            }
        }
        return minSumPoint;
    }
}
