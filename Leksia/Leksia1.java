package Leksia;

import org.junit.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Leksia1 {
    @Test
    public void testSimpleTrue() {
//        String pattern = "\\d{7}|\\d{3}[\\s\\-]?\\d{4}";
        /*String s= "1233323322";
        assertFalse(s.matches(pattern));
        s = "1233323";
        assertTrue(s.matches(pattern));
        s = "123 3323";
        assertTrue(s.matches(pattern));*/
        String s= "1233";
        assertTrue(test(s));
        s= "0";
        assertFalse(test(s));
        s = "29 Kasdkf 2300 Kdsdf";
        assertTrue(test(s));
        s = "99900234";
        assertTrue(test(s));

    }

    public static boolean test (String s){
//        String pattern = "\\d{7}|\\d{3}[\\s\\-]?\\d{4}";
//        Pattern pattern = Pattern.compile("\\d{7}|\\d{3}[\\s\\-]?\\d{4}");
        Pattern pattern = Pattern.compile("\\d{3}");
        Matcher matcher = pattern.matcher(s);
        if (matcher.find()){
            return true;
        }
        return false;
    }

}
