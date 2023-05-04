package Lab3.Part1;

import java.util.*;

public class Lab3_1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество слов: ");
        int n = scanner.nextInt();

        List<String> words = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Введите слово: ");
            String word = scanner.next();
            words.add(word);
            count +=1;
        }
        System.out.println(count);
        int minUniqueChars = Integer.MAX_VALUE;
        String minUniqueCharsWord = null;

        for (String word : words) {
            int uniqueChars = new HashSet<>(Arrays.asList(word.split(""))).size();
            if (uniqueChars < minUniqueChars) {
                minUniqueChars = uniqueChars;
                minUniqueCharsWord = word;
            }
        }

        System.out.println("Слово с минимальным количеством уникальных символов: " + minUniqueCharsWord);
    }
    public static void execute(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество слов: ");
        int n = scanner.nextInt();

        List<String> words = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Введите слово: ");
            String word = scanner.next();
            words.add(word);
            count +=1;
        }
        System.out.println(count);
        int minUniqueChars = Integer.MAX_VALUE;
        String minUniqueCharsWord = null;

        for (String word : words) {
            int uniqueChars = new HashSet<>(Arrays.asList(word.split(""))).size();
            if (uniqueChars < minUniqueChars) {
                minUniqueChars = uniqueChars;
                minUniqueCharsWord = word;
            }
        }

        System.out.println("Слово с минимальным количеством уникальных символов: " + minUniqueCharsWord);
    }
}
