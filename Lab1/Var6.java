package Lab1;

public class Var6 {
    public static void main(String[] args) {
        int[] A = { 2, 4, -8, 6, -12, 14, -10, 7, 9, -11, 16, -18, 20, -22, 24 };
        int[] B = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
        int[] C = { -2, -4, -6, -8, -10, -12, 1, 3, 5, 7, 9, 11 };

        //System.out.println(A.length);
        //System.out.println(B.length);
        //System.out.println(C.length);
        System.out.println("minA = " + findMin(A));
        System.out.println("minB = " + findMin(B));
        System.out.println("minC = " + findMin(C));
        int l= calculateL(A, B, C);
        System.out.println("l = " + l);
    }

    public static int calculateL(int[] A, int[] B, int[] C){
        int minA = findMin(A);
        int minB = findMin(B);
        int minC = findMin(C);
        int l;
        if (Math.abs(minA) > 10)
        {
            l= minB + minC;
        }
        else {
            l = 1 + Math.abs(minC);
        }
        return l;
    }
    public static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }}
