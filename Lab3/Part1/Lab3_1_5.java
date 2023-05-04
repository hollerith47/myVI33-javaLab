package Lab3.Part1;
import java.util.*;

public class Lab3_1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество слов: ");
        int n = scanner.nextInt();

        int latinWordsCount = 0;
        int equalVowelsConsonantsCount = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Введите слово: ");
            String word = scanner.next();
            if (isLatin(word)) {
                latinWordsCount++;
                if (isVowelsConsonantsEqual(word)) {
                    equalVowelsConsonantsCount++;
                }
            }
        }

        System.out.println("Количество слов, содержащих только символы латинского алфавита: " + latinWordsCount);
        System.out.println("Количество слов с равным числом гласных и согласных букв: " + equalVowelsConsonantsCount);
    }

    private static boolean isLatin(String word) {
        return word.matches("[a-zA-Z]+");
    }

    private static boolean isVowelsConsonantsEqual(String word) {
        int vowelsCount = 0;
        int consonantsCount = 0;
        for (char c : word.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                vowelsCount++;
            } else {
                consonantsCount++;
            }
        }
        return vowelsCount == consonantsCount;
    }
    public static void execute(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество слов: ");
        int n = scanner.nextInt();

        int latinWordsCount = 0;
        int equalVowelsConsonantsCount = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Введите слово: ");
            String word = scanner.next();
            if (isLatin(word)) {
                latinWordsCount++;
                if (isVowelsConsonantsEqual(word)) {
                    equalVowelsConsonantsCount++;
                }
            }
        }

        System.out.println("Количество слов, содержащих только символы латинского алфавита: " + latinWordsCount);
        System.out.println("Количество слов с равным числом гласных и согласных букв: " + equalVowelsConsonantsCount);
    }

}
