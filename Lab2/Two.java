package Lab2;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Two {
    public static void main(String[] args) {
        int n = 0;
        Scanner userInput = new Scanner(System.in);
        while (true) {
            System.out.print("Введите количество строк: ");
            try {
                n = userInput.nextInt();
                userInput.nextLine();
                break;
            } catch (InputMismatchException fg){
                System.out.println("Вы ввели не число. ");
            }
        }

        String[] lines = new String[n];
        for (int i = 0; i < n; i++){
            System.out.printf("Введите строку %d : ", i + 1);
            lines[i] = userInput.nextLine();
        }

        // Trie les chaînes par ordre croissant de longueur, puis par ordre croissant de valeur de longueur.
        Arrays.sort(lines, Comparator.comparingInt(String::length).thenComparing(String::valueOf));

        // Affiche les chaînes triées.
        System.out.println("Строки в порядке убывания длины:");
        int i = 1;
        for (String line : lines) {
            System.out.printf("строка %d : '%s' и ее длина %d",i, line, line.length()).println();
            i++;
        }
    }
}
