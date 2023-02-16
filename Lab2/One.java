package Lab2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class One {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = userInput.nextInt();
        userInput.nextLine();

        List<String> list = getList(n, userInput);
        System.out.println(list);

        String result = getShortestString(list);
        System.out.printf("Самая короткая строка: '%s' и ее длина %d",result, result.length()).println();
    }

    public static String getShortestString(List<String> list) {
        int minLength = Integer.MAX_VALUE;
        String shortestString = null;
        for (String s : list) {
            if (s.length()  < minLength) {
                minLength = s.length();
                shortestString = s;
            }
        }
        return shortestString;
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
}
