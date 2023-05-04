package Lab3.Part1;
import java.util.*;

public class Lab3_1_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество слов: ");
        int n = scanner.nextInt();
        String[] words = new String[n];
        List<String> orderWords = new ArrayList<String>();

        // Ввод n слов с консоли
        for (int i = 0; i < n; i++) {
            System.out.printf("Введите слов %d : ", i+1);
            words[i] = scanner.next();
        }
        for (String word : words) {
            boolean isIncreasing = true;
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) <= word.charAt(i - 1)) {
                    isIncreasing = false;
                    break;
                }
            }
            if (isIncreasing) {
                orderWords.add(word);
            }
        }

        if (orderWords.isEmpty()){
            System.out.println("Таких слов не найдено");
        }else {
            System.out.println("Слово, символы в котором идут в строгом порядке возрастания их кодов:");
            int count = 1;
            for (String orderWord : orderWords) {
                System.out.printf("%d. %s",count, orderWord).println();
                count ++;
            }
        }

    }
    public static void execute(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество слов: ");
        int n = scanner.nextInt();
        String[] words = new String[n];
        List<String> orderWords = new ArrayList<String>();

        // Ввод n слов с консоли
        for (int i = 0; i < n; i++) {
            System.out.printf("Введите слов %d : ", i+1);
            words[i] = scanner.next();
        }
        for (String word : words) {
            boolean isIncreasing = true;
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) <= word.charAt(i - 1)) {
                    isIncreasing = false;
                    break;
                }
            }
            if (isIncreasing) {
                orderWords.add(word);
            }
        }

        if (orderWords.isEmpty()){
            System.out.println("Таких слов не найдено");
        }else {
            System.out.println("Слово, символы в котором идут в строгом порядке возрастания их кодов:");
            int count = 1;
            for (String orderWord : orderWords) {
                System.out.printf("%d. %s",count, orderWord).println();
                count ++;
            }
        }

    }
}
