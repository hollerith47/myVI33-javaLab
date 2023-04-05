package Lab1_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class var4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String texte;
        char replacementChar;
        int k;
        while (true) {
            try {
                System.out.print("Введите строку : ");
                texte = userInput.nextLine();
                System.out.print("Введите значение k : ");
                k = userInput.nextInt();
                System.out.print("Введите символ замены: ");
                replacementChar = userInput.next().charAt(0);
                userInput.nextLine();
                break;
            } catch (InputMismatchException fg){
                System.out.println("Вы ввели не число. ");
            }
        }

        StringBuilder result = new StringBuilder();
        for (String word : texte.split(" ")){
            if (k<= word.length()){
                result.append(word, 0, k-1);
                result.append(replacementChar);
                result.append(word.substring(k));
            }else {
                result.append(word);
            }
            result.append(" ");
        }

        System.out.println("Résultat : " + result.toString().trim());
    }
}
