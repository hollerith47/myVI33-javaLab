package Lab1_1;

import java.util.ArrayList;
import java.util.List;

public class var8 {
    public static void main(String[] args) {
        String text = "ceci est un exemple de texte avec des mots inversés comme toto et otot";


        List<String> pairs = reverseWords(text);
        for (String pair : pairs) {
            System.out.println(pair);
        }
    }

    public static List<String> reverseWords(String text) {
        List<String> pairs = new ArrayList<>();
        String[] words = text.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isReversible(words[i], words[j])) {
                    pairs.add(words[i] + " - " + words[j]);
                }
            }
        }
        return pairs;
    }

    private static boolean isReversible(String word1, String word2) {
        return new StringBuilder(word1).reverse().toString().equals(word2) ||
                new StringBuilder(word2).reverse().toString().equals(word1);
    }
}
