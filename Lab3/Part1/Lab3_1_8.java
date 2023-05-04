package Lab3.Part1;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество слов: ");
        int n = scanner.nextInt();
        ArrayList<String> digitWords = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Введите слов %d : ", i+1);
            String word = scanner.next();
            if (isDigitWord(word)){
                digitWords.add(word);
            }
        }

        // Поиск второго слова-палиндрома среди слов
        int count = 0;
        for (String digitword: digitWords){
            if (isPalindromeWord(digitword)){
                count++;
                if (count == 2){
                    System.out.printf("Второго слова-палиндрома, состоящего только из цифр : %s", digitword);
                    return;
                }
            }
        }
        System.out.println("Второго слова-палиндрома, состоящего только из цифр, не найдено.");
    }

    public static boolean isDigitWord(String word){
        for (int i = 0; i < word.length(); i++){
            if (!Character.isDigit(word.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeWord(String word){
        for (int i = 0; i< word.length() / 2 ; i++){
            if (word.charAt(i) != word.charAt(word.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static void execute(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество слов: ");
        int n = scanner.nextInt();
        ArrayList<String> digitWords = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Введите слов %d : ", i+1);
            String word = scanner.next();
            if (isDigitWord(word)){
                digitWords.add(word);
            }
        }

        // Поиск второго слова-палиндрома среди слов
        int count = 0;
        for (String digitword: digitWords){
            if (isPalindromeWord(digitword)){
                count++;
                if (count == 2){
                    System.out.printf("Второго слова-палиндрома, состоящего только из цифр : %s", digitword);
                    return;
                }
            }
        }
        System.out.println("Второго слова-палиндрома, состоящего только из цифр, не найдено.");
    }

}
