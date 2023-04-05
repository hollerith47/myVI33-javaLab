package Lab2;

public class Lab2_1 {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        //float c = a / b; оператор приведения типа (float)
        float c = (float) a / b;
        double d = a * 1e-3 + c;
        System.out.println(d);
    }
}
