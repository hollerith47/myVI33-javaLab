package Lab1_1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class var3 {
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
                System.out.println("Вы ввели не число.");
            }
        }
        String[] strings = new String[n];
        int totalLength = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("Введите строку %d : ", i + 1);
            strings[i] = userInput.nextLine();
            totalLength += strings[i].length();
        }

        // средней
        double averageLength = (double) totalLength / n;

        System.out.printf("Строки, длина которых меньше средней (%.2f), это: %n", averageLength);
        for (String s : strings) {
            if (s.length() < averageLength) {
                System.out.printf("\"%s\" (длина : %d)%n", s, s.length());
            }
        }
    }
}
