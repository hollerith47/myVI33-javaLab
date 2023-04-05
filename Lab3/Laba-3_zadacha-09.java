import java.io.InputStream;
import java.text.DateFormatSymbols;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.*;
 
/**
 * @author m1st
 */
public class Main {
    public static void println(Object obj) {
        System.out.println(obj);
    }
 
    public static void print(Object obj) {
        System.out.print(obj);
    }
 
    public static void println() {
        System.out.println();
    }
    
    public static String[] toStringArray(Collection<String> list) {
        String[] result = new String[list.size()];
        Iterator<String> it = list.iterator();
        for (int i = 0; i < list.size(); i++) {
            result[i] = it.next();
        }
        return result;
    }
 
    public static String[] readInput(Scanner sc) {
        List<String> input = new ArrayList<String>();
        print("Введите строки через пробел, для окончания введите q: ");
        while (sc.hasNext()) {
            String word = sc.next();
            if (word.equals("q")) {
                break;
            } else {
                input.add(word);
            }
        }
        sc.close();
        return toStringArray(input);
    }
 
    public static String[] readInput(InputStream is) {
        return readInput(new Scanner(is));
    }
 
    public static String[] readInput() {
        return readInput(System.in);
    }
 
    public static int[] toIntArray(Collection<Integer> list) {
        int[] result = new int[list.size()];
        Iterator<Integer> it = list.iterator();
        for (int i = 0; i < list.size(); i++) {
            result[i] = it.next();
        }
        return result;
    }
 
    public static int[] toIntArray(String[] sourceStrings) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < sourceStrings.length; i++) {
            if (isNumericWord(sourceStrings[i])) {
                numbers.add(Integer.parseInt(sourceStrings[i]));
            }
        }
        int[] result = toIntArray(numbers);
        return result;
    }
    
    public static void findShortestAndLongestString(String[] sourceStrings) {
        String longest = sourceStrings[0];
        String shortest = sourceStrings[0];
        for (int i = 1; i < sourceStrings.length; i++) {
            if (shortest.length() > sourceStrings[i].length()) {
                shortest = sourceStrings[i];
            } else if (longest.length() < sourceStrings[i].length()) {
                longest = sourceStrings[i];
            }
        }
        println("Самая короткая строка (длина): " + shortest + "("
                + shortest.length() + ")");
        println("Самая длинная строка (длина): " + longest + "("
                + longest.length() + ")");
    }
 
    public static Map<String, Integer> sortStringsWithAscOrDescByLength(
            Map<String, Integer> map, char directionSign) {
        List<Entry<String, Integer>> forSortBylength = new ArrayList<Entry<String, Integer>>(
                map.entrySet());
        switch (directionSign) {
        case '>':
            Collections.sort(forSortBylength,
                    new Comparator<Entry<String, Integer>>() {
                        public int compare(Entry<String, Integer> o1,
                                Entry<String, Integer> o2) {
                            return ((Entry<String, Integer>) (o2)).getValue()
                                    .compareTo(
                                            ((Entry<String, Integer>) (o1))
                                                    .getValue());
                        }
                    });
            break;
        case '<':
            Collections.sort(forSortBylength,
                    new Comparator<Entry<String, Integer>>() {
                        public int compare(Entry<String, Integer> o1,
                                Entry<String, Integer> o2) {
                            return ((Entry<String, Integer>) (o1)).getValue()
                                    .compareTo(
                                            ((Entry<String, Integer>) (o2))
                                                    .getValue());
                        }
                    });
            break;
        default:
            System.err.print("Неверный знак сортировки: ");
            break;
        }
        Map<String, Integer> result = new LinkedHashMap<String, Integer>();
        for (Entry<String, Integer> entry : forSortBylength) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
 
    public static void findStringsLengthByAscAndDesc(String[] sourceStrings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : sourceStrings) {
            map.put(s, s.length());
        }
        println("Упорядоченные строки в порядке возрастания значений "
                + "их длины (строка=длина): "
                + sortStringsWithAscOrDescByLength(map, '<'));
        println("Упорядоченные строки в порядке убывания значений "
                + "их длины (строка=длина): "
                + sortStringsWithAscOrDescByLength(map, '>'));
    }
 
    public static int findAverageStringsLength(String[] sourceStrings) {
        int totalStringsLength = 0;
        for (String s : sourceStrings) {
            totalStringsLength += s.length();
        }
        int result = totalStringsLength / sourceStrings.length;
        return result;
    }
 
    public static void findStringsLessAndGreaterThanAverageLength(
            String[] sourceStrings) {
        final int averageStringsLength = findAverageStringsLength(sourceStrings);
        Map<String, Integer> stringsLessThanAverageLength = new HashMap<String, Integer>();
        Map<String, Integer> stringsGreaterThanAverageLength = new HashMap<String, Integer>();
        for (String s : sourceStrings) {
            if (s.length() < averageStringsLength) {
                stringsLessThanAverageLength.put(s, s.length());
            } else if (s.length() > averageStringsLength) {
                stringsGreaterThanAverageLength.put(s, s.length());
            }
        }
        println("Строки, длина которых < средней(" + averageStringsLength
                + ") (строка=длина): " + stringsLessThanAverageLength);
        println("Строки, длина которых > средней(" + averageStringsLength
                + ") (строка=длина): " + stringsGreaterThanAverageLength);
    }
 
    public static int countDifferentSymbolsInWord(String word) {
        char[] wordChars = word.toCharArray();
        int result = 0;
        for (int i = 1; i < wordChars.length; i++) {
            if (wordChars[0] != wordChars[i]) {
                result++;
            }
        }
        return result;
    }
 
    public static List<String> findWords(String[] sourceStrings) {
        Pattern wordPattern = Pattern.compile("[а-яa-z]+");
        List<String> result = new ArrayList<String>();
        for (String word : sourceStrings) {
            Matcher wordMatcher = wordPattern.matcher(word.toLowerCase());
            if (wordMatcher.matches()) {
                result.add(word);
            }
        }
        return result;
    }
 
    public static void findWordWithMinDifferentSymbols(String[] sourceWords) {
        final String message = "Слово, в котором число различных символов минимально (число различных символов): ";
        if (sourceWords.length == 0) {
            println(message + "Нет слов");
            return;
        }
        String result = sourceWords[0];
        for (int i = 1; i < sourceWords.length; i++) {
            if (countDifferentSymbolsInWord(result) > countDifferentSymbolsInWord(sourceWords[i])) {
                result = sourceWords[i];
            }
        }
        println(message + result + "(" + countDifferentSymbolsInWord(result)
                + ")");
    }
 
    public static List<String> findWordsInLatin(String[] sourceWords) {
        Pattern latinPattern = Pattern.compile("[a-z]+");
        List<String> result = new ArrayList<String>();
        for (String word : sourceWords) {
            Matcher latinMatcher = latinPattern.matcher(word.toLowerCase());
            if (latinMatcher.matches()) {
                result.add(word);
            }
        }
        return result;
    }
 
    public static void findWordsWithEqualNumberOfVowelsAndConsonantsInLatin(
            String[] sourceWords) {
        List<String> wordsInLatin = findWordsInLatin(sourceWords);
        println("Слова, содержащие только символы латинского алфавита (слов: "
                + wordsInLatin.size() + "): " + wordsInLatin);
        int vowelsCount, consonantsCount;
        print("а среди них – количество слов с равным числом гласных и согласных букв (гласных, согласных): ");
        for (String word : wordsInLatin) {
            vowelsCount = word.replaceAll("[^aeiou]", "").length();
            consonantsCount = word.replaceAll("[aeiou]", "").length();
            if (vowelsCount == consonantsCount) {
                print(word + "(" + vowelsCount + ", " + consonantsCount + "), ");
            }
        }
        println();
    }
 
    public static boolean isTwoCharSymbolCodesInAsc(char a, char b) {
        if ((int) b - (int) a == 1) {
            return true;
        }
        return false;
    }
 
    public static boolean isWordSymbolCodesInAsc(String word) {
        char[] wordChars = word.toCharArray();
        if (wordChars.length < 2) {
            return false;
        }
        boolean result = false;
        for (int i = 0; i < wordChars.length - 1; i++) {
            if (isTwoCharSymbolCodesInAsc(wordChars[i], wordChars[i + 1])) {
                result = true;
            } else {
                return false;
            }
        }
        if (result) {
            return true;
        }
        return false;
    }
 
    public static void findFirstWordWithSymbolCodesInAsc(String[] sourceWords) {
        print("Слово, символы в котором идут в строгом порядке возрастания их кодов: ");
        for (String word : sourceWords) {
            if (isWordSymbolCodesInAsc(word)) {
                print(word);
                break;
            }
        }
        println();
    }
 
    public static boolean hasUniqueChars(String word) {
        HashSet<Character> uniqueChars = new HashSet<Character>();
        for (Character ch : word.toCharArray()) {
            if (!uniqueChars.add(Character.toLowerCase(ch))) {
                return false;
            }
        }
        return true;
    }
 
    public static void findWordWithOnlyDifferentSymbols(String[] sourceWords) {
        for (String word : sourceWords) {
            if (word.length() > 1 && hasUniqueChars(word)) {
                println("Слово, состоящее только из различных символов: "
                        + word);
                break;
            }
        }
    }
 
    public static boolean isNumericWord(String word) {
        Pattern numericPattern = Pattern.compile("[+-]?[0-9]+");
        Matcher numericMatcher = numericPattern.matcher(word);
        if (numericMatcher.matches()) {
            return true;
        }
        return false;
    }
 
    public static void findFirstOrSecondNumericPalindromicWord(
            String[] sourceWords) {
        List<String> oneOrTwoNumericPalindromicWords = new ArrayList<String>();
        for (String word : sourceWords) {
            if (isNumericWord(word)) {
                boolean isInputPalindrome = word.equals(new StringBuilder(word)
                        .reverse().toString()) ? true : false;
                if (isInputPalindrome) {
                    oneOrTwoNumericPalindromicWords.add(word);
                }
            }
        }
        final String message = "Слово-палиндром, состоящее только из цифр: ";
        if (oneOrTwoNumericPalindromicWords.size() == 0) {
            println(message + "Нет слов");
            return;
        }
        if (oneOrTwoNumericPalindromicWords.size() == 1) {
            println(message + oneOrTwoNumericPalindromicWords.get(0));
        } else {
            println("Слов-палиндромов, состоящих только из цифр > 1. Второе из них: "
                    + oneOrTwoNumericPalindromicWords.get(1));
        }
    }
 
    /**
     * @since 1.7
     */
    public static void isBelongToInterval(int[] kSourceValues,
            String... intervals) {
        print("Вхождения в интервалы " + Arrays.toString(intervals) + ": ");
        for (String s : intervals) {
            for (int k : kSourceValues) {
                String interval = null;
                switch (s) {
                case "(-10000, 0]":
                    if (k > -10000 && k <= 0) {
                        interval = s;
                    }
                    break;
                case "(-10000, 5]":
                    if (k > -10000 && k <= 5) {
                        interval = s;
                    }
                    break;
                case "(0, 5]":
                    if (k > 0 && k <= 5) {
                        interval = s;
                    }
                    break;
                case "[0, 10]":
                    if (k >= 0 && k <= 10) {
                        interval = s;
                    }
                    break;
                case "(5, 10]":
                    if (k > 5 && k <= 10) {
                        interval = s;
                    }
                    break;
                case "[5, 15]":
                    if (k >= 5 && k <= 15) {
                        interval = s;
                    }
                    break;
                case "(10, 10000]":
                    if (k > 10 && k <= 10000) {
                        interval = s;
                    }
                    break;
                case "[10, 10000]":
                    if (k >= 10 && k <= 10000) {
                        interval = s;
                    }
                    break;
                default:
                    System.err.println("Ошибка интервала: " + s);
                    return;
                }
                if (interval != null) {
                    print(k + " ∈ " + interval + ", ");
                }
            }
        }
        println();
    }
 
    public static void fillQuadMatrixFromLeftToRightOrDownwardForInt(
            int[][] matrix, char fillDirection) {
        final int quadMatrixLength = matrix.length * matrix.length;
        List<Integer> numbers = new ArrayList<Integer>(quadMatrixLength);
        for (int i = 1; i <= quadMatrixLength; i++) {
            numbers.add(i);
        }
        Iterator<Integer> it = numbers.iterator();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (fillDirection == '→') {
                    matrix[i][j] = it.next();
                } else if (fillDirection == '↓') {
                    matrix[j][i] = it.next();
                }
            }
        }
        println();
    }
 
    public static void printQuadMatrix(int[][] matrix) {
        for (int[] i : matrix) {
            for (int j : i) {
                System.out.printf("%3s", j);
            }
            println();
        }
    }
 
    public static void printIntFilled5x5Matrix(char... fillDirection) {
        println("Числа от 1 до 25 в виде матрицы 5x5 слева направо и сверху вниз: ");
        int[][] matrix = new int[5][5];
        for (char c : fillDirection) {
            fillQuadMatrixFromLeftToRightOrDownwardForInt(matrix, c);
            printQuadMatrix(matrix);
        }
    }
 
    public static void findQuadraticRoots(String[] args) {
        print("Находение корней квадратного уравнения ax^2 + bx + c = 0, a != 0: ");
        if (args.length < 3) {
            println("Введите параметры уравнения(a, b, c) с командной строки");
            return;
        }
        final int a = Integer.parseInt(args[0]);
        final int b = Integer.parseInt(args[1]);
        final int c = Integer.parseInt(args[2]);
        print(a + "x^2 + " + b + "x + " + c + " = 0, a != 0: ");
        int x, x1, x2;
        final int discriminant = (b * b) - (4 * a * c);
        String noRoots = "Корней нет";
        String oneRoot = "Один корень: ";
        String twoRoots = "Корней два: ";
        if (a == 0) {
            println("a == 0");
            return;
        } else if (b == 0 & c == 0) {
            x = 0;
            println(oneRoot + x);
            return;
        } else if (b == 0) {
            x = -c / a;
            if (x >= 0) {
                x = (int) Math.sqrt(-c / a);
                println(twoRoots + x + ", " + (-x));
            } else {
                println(noRoots);
                return;
            }
        } else if (c == 0) {
            x1 = 0;
            x2 = -(b / a);
            println(twoRoots + x1 + ", " + x2);
        } else if (discriminant < 0) {
            println(noRoots);
            return;
        } else if (discriminant == 0) {
            x = (int) ((-b + Math.sqrt(discriminant)) / 2 * a);
            println(oneRoot + x);
        } else if (discriminant > 0) {
            x1 = (int) ((-b + Math.sqrt(discriminant)) / 2 * a);
            x2 = (int) ((-b - Math.sqrt(discriminant)) / 2 * a);
            println(twoRoots + x1 + ", " + x2);
        }
    }
 
    public static List<Integer> findMonthNumbers(String[] sourceStrings) {
        Pattern monthNumberPattern = Pattern.compile("[1-9][0-2]?");
        List<Integer> result = new ArrayList<Integer>();
        for (String s : sourceStrings) {
            Matcher monthNumberMatcher = monthNumberPattern.matcher(s);
            if (monthNumberMatcher.matches()) {
                result.add(Integer.parseInt(s));
            }
        }
        return result;
    }
 
    public static void getMonthFromInt(String[] sourceStrings) {
        print("Название месяца, соответствующее числу от 1 до 12: ");
        List<Integer> sourceMonthes = findMonthNumbers(sourceStrings);
        String[] monthNames = new DateFormatSymbols().getMonths();
        for (int month : sourceMonthes) {
            print(monthNames[month - 1] + "(" + month + "), ");
        }
    }
    public static void main(String[] args) {
        // 0. Ввести n строк с консоли.
        String[] sourceStrings = readInput();
        if (sourceStrings.length == 0) {
            System.out.println("Нет строк. Программа завершена.");
            System.exit(0);
        }
 
        // 1. Найти самую короткую и самую длинную строки. Вывести найденные
        // строки и их длину.
        findShortestAndLongestString(sourceStrings);
 
        // 2. Упорядочить и вывести строки в порядке возрастания (убывания)
        // значений их длины.
        findStringsLengthByAscAndDesc(sourceStrings);
 
        // 3. Вывести на консоль те строки, длина которых меньше (больше)
        // средней, а также длину.
        findStringsLessAndGreaterThanAverageLength(sourceStrings);
 
        // 4. Найти слово, в котором число различных символов минимально. Если
        // таких слов несколько, найти первое из них.
        String[] sourceWords = toStringArray(findWords(sourceStrings));
        findWordWithMinDifferentSymbols(sourceWords);
 
        // 5. Найти количество слов, содержащих только символы латинского
        // алфавита, а среди них – количество слов с равным числом гласных и
        // согласных букв.
        findWordsWithEqualNumberOfVowelsAndConsonantsInLatin(sourceWords);
 
        // 6. Найти слово, символы в котором идут в строгом порядке возрастания
        // их кодов. Если таких слов несколько, найти первое из них.
        findFirstWordWithSymbolCodesInAsc(sourceWords);
 
        // 7. Найти слово, состоящее только из различных символов. Если таких
        // слов несколько, найти первое из них.
        findWordWithOnlyDifferentSymbols(sourceWords);
 
        // 8. Среди слов, состоящих только из цифр, найти слово-палиндром. Если
        // таких слов больше одного, найти второе из них.
        findFirstOrSecondNumericPalindromicWord(sourceStrings);
 
        // 9. Написать программы решения задач 1–8, осуществляя ввод строк как
        // аргументов командной строки.
        /**
         * To uncomment the statements below for exercise 9
         */
        // findShortestAndLongestString(sourceStrings); // 1.
        // findStringsLengthByAscAndDesc(sourceStrings); // 2.
        // findStringsLessAndGreaterThanAverageLength(sourceStrings); // 3.
        // findWordWithMinDifferentSymbols(sourceStrings); // 4.
        // findWordsWithEqualNumberOfVowelsAndConsonantsInLatin(sourceWords); // 5.
        // findFirstWordWithSymbolCodesInAsc(sourceWords); // 6.
        // findWordWithOnlyDifferentSymbols(sourceWords); // 7.
        // findFirstOrSecondNumericPalindromicWord(sourceStrings); // 8.
 
        // 10. Используя оператор switch, написать программу, которая выводит на
        // экран сообщения о принадлежности некоторого значения k интервалам
        // (-10k, 0], (0, 5], (5, 10], (10, 10k].
        int[] kSourceValues = toIntArray(sourceStrings);
        isBelongToInterval(kSourceValues, "(-10000, 0]", "(0, 5]", "(5, 10]",
                "(10, 10000]");
 
        // 11. Используя оператор switch, написать программу, которая выводит на
        // экран сообщения о принадлежности некоторого значения k интервалам
        // (-10k, 5], [0, 10], [5, 15], [10, 10k].
        isBelongToInterval(kSourceValues, "(-10000, 5]", "[0, 10]", "[5, 15]",
                "[10, 10000]");
 
        // 12. Написать программу, которая выводит числа от 1 до 25 в виде
        // матрицы 5x5 слева направо и сверху вниз.
        printIntFilled5x5Matrix('→', '↓');
 
        // 13. Написать программу, позволяющую корректно находить корни
        // квадратного уравнения. Параметры уравнения должны задаваться с
        // командной строки.
        findQuadraticRoots(args);
 
        // 14. Ввести число от 1 до 12. Вывести на консоль название месяца,
        // соответствующего данному числу. (Осуществить проверку корректности
        // ввода чисел).
        getMonthFromInt(sourceStrings);
    }
}