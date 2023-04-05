package Lab1_1;

public class var6 {
    public static void main(String[] args) {
        String entry = "Из небольшого текста удалить все символы % $, кроме пробелов, не являющиеся буквами!.";
        // Удаление всех символов, кроме пробелов и букв
        String output = entry.replaceAll("[^\\p{L}\\s]", "");
        // Добавление пробелов между буквами
        output = output.replaceAll("(\\p{L})(\\p{L}+)", "$1$2");
        System.out.println(output);
    }

}
