package Lab3.Part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab3_2_9 {
    public static void main(String[] args) {
        String input = "Если есть хвосты по дз, начните с 121 не сданного задания. 123 324 111 4554";
        System.out.println(findPalindrome(input));
    }

    public static String findPalindrome(String input) {
        Pattern pattern = Pattern.compile("\\b\\d+\\b");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String word = matcher.group();
            String reversed = new StringBuilder(word).reverse().toString();

            if (word.equals(reversed)) {
                return word;
            }
        }

        return null;
    }
}
