package Lab1_1;

public class var7 {
    public static void main(String[] args) {
        System.out.println("var7");
        String text = "Это текст, в Котором надо удалить слова определенной длины. Например, слова, начинающиеся на согласную.";
        String question = "Из екста удалить все слова заданной длины, начинающиеся на согласную букву";
        int length = 8;

        String result = removeWords(question, length);
        System.out.println(result);
    }

    public static String removeWords(String text, int Length) {
        String[] words = text.split("\\s+");
        StringBuilder newString = new StringBuilder();

        for (String word : words) {
            if (word.length() != Length || isVowel(word.charAt(0))) {
                newString.append(word).append(" ");
            }
        }
        return newString.toString().trim();

    }
    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
