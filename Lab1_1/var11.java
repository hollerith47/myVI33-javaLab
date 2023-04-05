package Lab1_1;

public class var11 {
    public static void main(String[] args) {
        double[][] points = {{0.1, 0.2}, {0.3, 0.4}, {0.5, 0.6}, {0.7, 0.8}, {0.9, 0.1}};
        double[][] maxPerimeterTriangle = findMaxPerimeterTriangle(points);
        System.out.println("Треугольник наибольшего периметра: " +
                "(" + maxPerimeterTriangle[0][0] + ", " + maxPerimeterTriangle[0][1] + "), " +
                "(" + maxPerimeterTriangle[1][0] + ", " + maxPerimeterTriangle[1][1] + "), " +
                "(" + maxPerimeterTriangle[2][0] + ", " + maxPerimeterTriangle[2][1] + ")"
        );
    }


    public static double[][] findMaxPerimeterTriangle(double[][] points) {
        int n = points.length;
        double[][] maxPerimeterTriangle = new double[3][2];
        double maxPerimeter = 0.0;
        // Перебираем все тройки точек parcourir tout les points
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    double a = distance(points[i], points[j]);
                    double b = distance(points[i], points[k]);
                    double c = distance(points[j], points[k]);
                    double perimeter = a + b + c;
                    // Если периметр треугольника больше максимального, то обновляем максимальный периметр и тройку точек
                    if (perimeter > maxPerimeter) {
                        maxPerimeter = perimeter;
                        maxPerimeterTriangle[0] = points[i];
                        maxPerimeterTriangle[1] = points[j];
                        maxPerimeterTriangle[2] = points[k];
                    }
                }
            }
        }
        return maxPerimeterTriangle;
    }

    // Метод для вычисления расстояния между двумя точками на плоскости
    public static double distance(double[] p1, double[] p2) {
        double dx = p1[0] - p2[0];
        double dy = p1[1] - p2[1];
        return Math.sqrt(dx * dx + dy * dy);
    }
    /*
    * Программа задает множество точек на плоскости и перебирает все тройки точек,
    * вычисляя для каждой тройки периметр треугольника, составленного этими точками.
    * Затем программа находит тройку точек, составляющую треугольник наибольшего периметра
    * Le programme définit un ensemble de points sur le plan et parcourt toutes
    * les triples de points, calculant pour chaque triple le périmètre du triangle
    * formé par ces points. Ensuite, le programme trouve la triple de points formant
    * le triangle ayant le plus grand périmètre.
    */
}
