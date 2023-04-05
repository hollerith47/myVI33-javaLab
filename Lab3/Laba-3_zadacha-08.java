
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
       public static void findFirstOrSecondNumericPalindromicWord(
            String[] sourceWords) {
        List<String> oneOrTwoNumericPalindromicWords = new ArrayList<String>();
        for (String word : sourceWords) {
            if (isNumericWord(word)) {
                boolean isInputPalindrome = word.equals(new StringBuilder(word)
                        .reverse().toString()) ? true : false;
                if (isInputPalindrome) {
                    oneOrTwoNumericPalindromicWords.add(word);
                }
            }
        }
        final String message = "Слово-палиндром, состоящее только из цифр: ";
        if (oneOrTwoNumericPalindromicWords.size() == 0) {
            println(message + "Нет слов");
            return;
        }
        if (oneOrTwoNumericPalindromicWords.size() == 1) {
            println(message + oneOrTwoNumericPalindromicWords.get(0));
        } else {
            println("Слов-палиндромов, состоящих только из цифр > 1. Второе из них: "
                    + oneOrTwoNumericPalindromicWords.get(1));
        }
    }
}

        // 8. Среди слов, состоящих только из цифр, найти слово-палиндром. Если
        // таких слов больше одного, найти второе из них.
        findFirstOrSecondNumericPalindromicWord(sourceStrings);





