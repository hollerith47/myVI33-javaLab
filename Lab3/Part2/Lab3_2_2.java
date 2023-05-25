package Lab3.Part2;

public class Lab3_2_2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 56;
        questionBuilder(a, b);
    }

    public static void questionBuilder(int a, int b){
        //а) Дано два числа, например 3 и 56, необходимо составить
        // следующие строки:
        StringBuilder result = new StringBuilder();
        result.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
        result.append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n");
        result.append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
        System.out.println(result.toString());

        StringBuilder result2 = new StringBuilder(result);

        // б) Замените символ „=” на слово „равно”.
        int index = result.indexOf("=");
        while ( index != -1 ){
            result.deleteCharAt(index).insert(index, "равно");
            index = result.indexOf("=", index + "равно".length());
        }
        System.out.println(result.toString());

        //в) Замените символ “=” на слово “равно”.
        // Используйте методы StringBuilder.replace().

        int index1 = result2.indexOf("=");
        while ( index1 != -1 ){
            result2.replace(index1,index1 + 2 , " равно ");
            index1 = result2.indexOf("=", index1 + " равно ".length());
        }
        System.out.println(result2.toString());
    }
}
