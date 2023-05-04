package Lab3.Part1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab3_1_7 {
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
            boolean isDistinct = true;
            for (int i = 1; i < word.length(); i++) {
                for (int j = i + 1; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        isDistinct = false;
                        break;
                    }
                }
                if (!isDistinct) {
                    break;
                }
            }
            if (isDistinct) {
                System.out.println("слов, состоящих только из различных символов" + word);
                return;
            }
        }
        System.out.println("Нет слов, состоящих только из различных символов");

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
            boolean isDistinct = true;
            for (int i = 1; i < word.length(); i++) {
                for (int j = i + 1; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        isDistinct = false;
                        break;
                    }
                }
                if (!isDistinct) {
                    break;
                }
            }
            if (isDistinct) {
                System.out.println("слов, состоящих только из различных символов" + word);
                return;
            }
        }
        System.out.println("Нет слов, состоящих только из различных символов");

    }

}
