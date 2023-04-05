
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = 0;
        while (true)
        {
            System.out.println("Введите количество строк:");
            Scanner sc1 = new Scanner(System.in);
            try 
            {
                n = sc1.nextInt();
                break;
            }
            catch (InputMismatchException fg) 
            {
                System.out.print("Неверный ввод.");
            }
        }
 
        String[] strings = new String[n];
        Scanner sc2 = new Scanner(System.in);
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Введите строку №" + (i + 1));
            strings[i] = sc2.nextLine();
        }
 
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n-1; j++) 
            {
                if (strings[j].length() == strings[j+1].length())
                {
                    int first_counter = 0;
                    int second_counter = 0;
                    for (int k = 0; k < strings[j].length()-1; k++)
                    {
                        if (Character.isDigit(strings[j].charAt(k))) first_counter++;
                        if (Character.isDigit(strings[j+1].charAt(k))) second_counter++;
                    }
if (first_counter > second_counter)
                    {
                        String temp = strings[j];
                        strings[j] = strings[j+1];
                        strings[j+1] = temp;
                    }
                }
        else
                    if (strings[j].length() > strings[j+1].length()) 
                    {
                        String temp = strings[j];
                        strings[j] = strings[j+1];
                        strings[j+1] = temp;
                    }
            }
        }
        int maxLength = strings[n-1].length();
        System.out.println("Строки в порядке возврастания длины:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(strings[i]);
            for (int j = strings[i].length(); j < maxLength + 2; j++) System.out.print(".");
            System.out.println("длина = " + strings[i].length());
        }
    }
}