package Lab1_1;
import java.util.HashMap;
import java.util.Map;

public class var9 {
    public static void main(String[] args) {
        String text = "ceci est un exemple de texte avec des mots qui se répètent en des examples";
        countWords(text);

    }

    public static void countWords(String text){
        String[] words = text.split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            int count = wordCount.getOrDefault(word, 0);
            wordCount.put(word, count + 1);
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
