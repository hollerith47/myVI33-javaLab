package Lab2;

public class Lab2_5 {
    public static void main(String[] args) {
        //long l = (byte) 1234_564_890L;
        long l = 1234_564_890L;
        int x = 0b1000_1100_1010;
        double m = (byte) 110_987_654_6299.123_34;
        float f = (long)l++ + 10 + ++x - (float) m;
        l = (long) f / 1000;
        System.out.println(l);
    }
}
