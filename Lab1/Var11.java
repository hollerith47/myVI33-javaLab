package Lab1;
import java.util.Arrays;

public class Var11 {
    public static void main(String[] args) {
        int[] array = { 123, 456, 789, 321, 654, 987 };

        System.out.println("Исходный массив: " + Arrays.toString(array));

        // Сортировка массива
        Arrays.sort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));

        // Вывод суммы цифр каждого числа
        for (int i : array) {
            int sum = getSumOfDigits(i);
            System.out.println("Сумма цифр числа " + i + " равна " + sum);
        }
    }

    public static int getSumOfDigits(int number) {
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }
}
