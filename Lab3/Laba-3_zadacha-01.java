
/**
 * 1.Ввести n строк с консоли, найти самую короткую и самую длинную строки.
 * Вывести найденные строки и их длину.
 */
 
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n строк, окончание ввода строк, завершите пустой строкой.");
        String line = in.nextLine();
        String minLine = line;
        String maxLine = line;
        while (!line.isEmpty()) {
            if (minLine.length() > line.length()) {
                minLine = line;
            } else if (maxLine.length() < line.length()) {
                maxLine = line;
            }
            line = in.nextLine();
        }
        if(minLine == maxLine) {
            System.out.println("Введена одна строка или строки одинаковы " + minLine);
        }
        else{
            System.out.println("Самая короткая строка " + minLine+ "("
                + minLine.length() + ")");
            System.out.println("Самая длинная строка строка " + maxLine + "("
                + maxLine.length() + ")");
            

        }
 
    }
 
}