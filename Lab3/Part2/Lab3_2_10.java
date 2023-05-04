package Lab3.Part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab3_2_10 {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("a*b");
        Pattern pattern = Pattern.compile("c{1,3}ab");
        Matcher matcher = pattern.matcher("ccab");
        boolean b = matcher.matches();
        System.out.println(b); // Output: true

        Pattern pattern1 = Pattern.compile("c+a+b");
        Matcher matcher1 = pattern1.matcher("cccab");
        boolean b1 = matcher1.matches();
        System.out.println(b1);
    }
}
