 
package com.company;
 
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
    
        Scanner scan;
        
        String text;
        
        String[] textArray;
 
        int sentenceCount = 0;
        int wordsCount = 0;
        int wordsCounttmp = 0;
        int indexSentenceWord = 0;
        int lettersCount = 0;
        int lettersCounttmp = 0;
        int indexSentenceLetter = 0;
 
        System.out.println("Введите текст:");
 
        scan = new Scanner(System.in);
        text = scan.nextLine();
 
        textArray = text.split("[.?!]");
        sentenceCount = textArray.length;
 
        for(int i = 0; i < sentenceCount; i++) {
            wordsCounttmp = textArray[i].split(" ").length;
            
            if(wordsCounttmp > wordsCount) {
                wordsCount = wordsCounttmp;
                indexSentenceWord = i;
            }
            String[] wordsArr = textArray[i].split(" ");
            for(String word : wordsArr) {
                lettersCounttmp = lettersCounter(word);
                
                if(lettersCounttmp > lettersCount) {
                    lettersCount = lettersCounttmp;
                    indexSentenceLetter = i;
                }
            }
        }
 
        System.out.println("Количество предложений:\n" + sentenceCount + "\n" +
            "Предложение с максимальным количеством слов:\n" + textArray[indexSentenceWord] + "\n" +
            "Предложение, которое содержит слово с максимальным количеством букв:\n" + textArray[indexSentenceLetter]);
    }
 
    private static int lettersCounter(String word) {
        int count = 0;
        
        word = word.replaceAll("[“:”,-_\"';()]", "");
        count = word.length();
        
        return count;
    }
}
 

 
package com.company;
 
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
    
        Scanner scan;
 
        String text;
        String resultWord = null;
        String[] textArray;
 
        int[] wordsArray;
        int uniqCount = 0;
        int minCount = 100;
        int maxCount = 0;
 
        System.out.println("Введите текст:");
 
        scan = new Scanner(System.in);
        text = scan.nextLine();
 
        textArray = text.split(" ");
        wordsArray = new int[textArray.length];
 
        for(int i = 0; i < textArray.length; i++) {
            textArray[i] = textArray[i].replaceAll("[“:”,-_\"'`;()]", "");
            uniqCount = uniqueSymbolsCounter(textArray[i]);
            wordsArray[i] = uniqCount;
        }
 
        for(int i = 0; i < wordsArray.length; i++) {
            if(minCount > wordsArray[i]) {
                minCount = wordsArray[i];
            }
        }
        
        for(int i = 0; i < wordsArray.length; i++) {
            if(minCount == wordsArray[i]) {
                if(maxCount < textArray[i].length()) {
                    resultWord = textArray[i];
                    maxCount = textArray[i].length();
                }
            }
        }
        
        System.out.print("Слово, в котором число различных символов минимально:\n" + resultWord);
    }
 
    private static int uniqueSymbolsCounter(String word) {
        ArrayList<Character> lst = new ArrayList<Character>();
        char[] chars = word.toCharArray();
 
        int count = 0;
 
        for(char c : chars) {
            if (!lst.contains(c)) {
                lst.add(c);
            }
        }
 
        count = lst.size();
        return count;
    }
}
 
 

 
package com.company;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner scan;
 
        int countLatinWords = 0;
 
        String text;
        String[] textArray;
 
        ArrayList<String> wordsList = new ArrayList<>();
 
        System.out.println("Введите текст:");
 
        scan = new Scanner(System.in);
        text = scan.nextLine();
        
        textArray = text.split(" ");
 
        for(int i = 0; i < textArray.length; i++) {
            textArray[i] = textArray[i].replaceAll("[“:”,\"'`;()?_-]", "");
            if(findLatinOnly(textArray[i]) > 0) {
                wordsList.add(textArray[i]);
            }
        }
 
        for(String word : wordsList) {
            if(checkVowelsConsonants(word)) {
                countLatinWords++;
            }
        }
 
        System.out.print("Количество слов, содержащих только символы латинского алфавита с равным числом гласных и согласных букв:\n" + countLatinWords);
    }
 
    private static int findLatinOnly(String word) {
        int length = 0;
 
        if(word.length() == word.replaceAll("[а-я]", "").length()) {
            length = word.length();
        }
 
        return length;
    }
 
    private static boolean checkVowelsConsonants(String word) {
        boolean result = false;
 
        int vowel = 0;
        int consonant = 0;
 
        ArrayList<Character> charList = new ArrayList<>(Arrays.asList('A','a','E','e','I','i','O','o','U','u','Y','y'));
        char[] chars = word.toCharArray();
 
        for(char c : chars) {
            if(charList.contains(c)) {
                vowel++;
            }
            else {
                consonant++;
            }
        }
 
        result = vowel == consonant ? true : false;
 
        return result;
    }
}
 

 
package com.company;
 
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        Scanner scan;
 
        String text;
        String[] textArray;
 
        System.out.println("Введите текст:");
 
        scan = new Scanner(System.in);
        text = scan.nextLine();
 
        textArray = text.split(" ");
 
        for(int i = 0; i < textArray.length; i++) {
            textArray[i] = textArray[i].replaceAll("[“:”,\"'`;()?_-]", "");
            if(uniqueSymbolsChecker(textArray[i])) {
                System.out.print("Cлово, состоящее только из различных символов:\n" + textArray[i]);
                break;
            }
        }
    }
 
    private static boolean uniqueSymbolsChecker(String word) {
        boolean result = false;
 
        ArrayList<Character> list = new ArrayList<>();
        char[] chars = word.toCharArray();
 
        for(char c : chars) {
            if (list.contains(c)) {
                result = false;
                return result;
            }
            else {
                list.add(c);
                result = true;
            }
        }
 
        return result;
    }
}