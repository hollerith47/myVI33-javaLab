package Lab3.Part2;

public class Lab3_2_4 {
    public static void main(String[] args) {
        System.out.println(middleTwoChars("string")); // Output: "ri"
        System.out.println(middleTwoChars("code"));   // Output: "od"
        System.out.println(middleTwoChars("Practice"));// Output: "ct"
    }

    public static String middleTwoChars(String str) {
        if (str.length() % 2 == 0) {
            int middle = str.length() / 2;
            return str.substring(middle - 1, middle + 1);
        }
        return "Длина входной строки нечетная!";
    }
}
