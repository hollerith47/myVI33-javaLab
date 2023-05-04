package Lab3.Part2;

import java.util.HashSet;
import java.util.Set;

public class Lab3_2_7 {
    public static void main(String[] args) {
        String str = "fffff ab f 1234 jkjk";
        System.out.println(findMinDistinctChar(str));
    }

    public static String findMinDistinctChar(String str) {
        String[] words = str.split(" ");
        String result = null;
        int minCount = Integer.MAX_VALUE;

        for (String word : words) {
            Set<Character> distinctChars = new HashSet<>();

            for (char c : word.toCharArray()) {
                distinctChars.add(c);
            }

            if (distinctChars.size() < minCount) {
                minCount = distinctChars.size();
                result = word;
            }
        }

        return result;
    }
}
