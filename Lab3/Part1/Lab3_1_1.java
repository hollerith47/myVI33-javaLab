package Lab3.Part1;

import java.util.*;

public class Lab3_1_1 {
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

        List<String> list = getList(n, userInput);
        System.out.println(list);

        String[] result = getStrings(list);
        String shortest = result[0];
        String largest = result[1];

        System.out.printf("Самая короткая строка: '%s' и ее длина %d",shortest, shortest.length()).println();
        System.out.printf("Самая длиная строка: '%s' и ее длина %d",largest, largest.length()).println();

    }

    public static String[] getStrings(List<String> list) {
        int minLength = Integer.MAX_VALUE;
        String shortestString = null;
        int maxLength = Integer.MIN_VALUE;
        String largestString = null;
        for (String s : list) {
            if (s.length()  < minLength) {
                minLength = s.length();
                shortestString = s;
            }
            if (s.length()  > maxLength) {
                maxLength = s.length();
                largestString = s;
            }
        }
        return new String[]{shortestString, largestString};
    }

    public static List<String> getList(int n, Scanner userInput){
        List<String> list = new ArrayList<String>();
        for (int i = 0; i <n ; i++) {
            System.out.printf("Введите строку %d : ", i+1);
            String stringInput = userInput.nextLine();
            list.add(stringInput);
        }
        return list;
    }

    public static void execute(String[] args) {
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

        List<String> list = getList(n, userInput);
        System.out.println(list);

        String[] result = getStrings(list);
        String shortest = result[0];
        String largest = result[1];

        System.out.printf("Самая короткая строка: '%s' и ее длина %d",shortest, shortest.length()).println();
        System.out.printf("Самая длиная строка: '%s' и ее длина %d",largest, largest.length()).println();

    }
}
