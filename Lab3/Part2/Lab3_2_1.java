package Lab3.Part2;

public class Lab3_2_1 {
    public static void main(String[] args) {
        //а.
        String str = "I like Java!!!";
        printString(str);

        //б. Распечатать последний символ строки. Используем метод
        // String.charAt().
        System.out.println(str.charAt(str.length() - 1));

        //в. Проверить, заканчивается ли ваша строка подстрокой “!!!”.
        // Используем метод String.endsWith().
        System.out.println(str.endsWith("!!!"));

        //г. Проверить, начинается ли ваша строка подстрокой “I like”.
        // Используем метод String.startsWith().
        if (str.startsWith("I like")) {
            System.out.println("Строка начинается с подстроки 'I like'");
        } else {
            System.out.println("Строка не начинается с подстроки 'I like'");
        }


        //Д. Проверить, содержит ли ваша строка подстроку “Java”.
        // Используем метод String.contains().
        System.out.println(str.contains("Java"));


        // е. Найти позицию подстроки “Java” в строке “I like Java!!!”.
        String toFind = "Java";
        int indexOfJava = str.indexOf(toFind);
        System.out.println("позицию подстроки " + toFind + " в строке" + str + " : " + indexOfJava);

        //Ж. Заменить все символы “а” на “о”.
        String replacedStr = str.replace('a', 'o');
        System.out.println(replacedStr);

        //З. Преобразуйте строку к верхнему регистр
        //Метод для преобразования строки к верхнему регистру в Java - это метод toUpperCase() класса String.
        String upperCaseStr = str.toUpperCase();
        System.out.println(upperCaseStr);

        //И. Преобразуйте строку к нижнему регистру.
        String strLower = str.toLowerCase();
        System.out.println(strLower);

        //К. Вырезать строку Java c помощью метода String.substring().
        String newStr = str.substring(str.indexOf("Java"), str.indexOf("Java")+4);
        System.out.println(newStr);

    }

    public static void printString(String str) {
        //1.
        System.out.println(str);
    }
}
