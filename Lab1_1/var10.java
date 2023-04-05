package Lab1_1;

import java.util.Arrays;

public class var10 {
    public static void main(String[] args) {
        String text = "Java - объектно-ориентированный язык программирования. " +
                "Был создан Джеймсом Гослингом в компании Sun Microsystems " +
                "и сейчас поддерживается компанией Oracle. Java является одним из самых популярных языков " +
                "в мире и используется для разработки приложений для широкого спектра платформ.";

        countVowelsAndConsonants(text);
    }

    public static void countVowelsAndConsonants(String sentence){
        int vowelCount = 0;
        int consonantCount = 0;
        sentence = sentence.toLowerCase();

        for (int i=0; i < sentence.length(); i++){
            char ch = sentence.charAt(i);
            if (Character.isLetter(ch)) {
                // Проверяем, является ли символ гласной
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                }
                // Иначе, символ является согласной
                else {
                    consonantCount++;
                }
            }
        }
        // Выводим результат
        System.out.println("Количество гласных: " + vowelCount);
        System.out.println("Количество согласных: " + consonantCount);
    }
}
