package Lab3.Part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab3_2_8 {
    public static void main(String[] args) {
        String str = "One two three раз два три one1 two2 123";
        System.out.printf("Количество слов, содержащих только символы латинского алфавита равно %d",
                countLatinWords(str));
    }

    public static int countLatinWords(String str) {
        Pattern pattern = Pattern.compile("\\b[a-zA-Z]+\\b");
        //\\b: is a position that marks the beginning or end of a word.
        //The plus sign (+) indicates that one or more of the preceding character class (letters) should be matched.

        Matcher matcher = pattern.matcher(str);
        int count = 0;

        while (matcher.find()) {
            count++;
        }

        return count;
    }
    
}
