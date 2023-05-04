package Lab3.Part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab3_2_6 {
    public static void main(String[] args) {
        String str = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        Pattern pattern = Pattern.compile("Java\\s+\\d+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group().trim());
        }
    }
}
