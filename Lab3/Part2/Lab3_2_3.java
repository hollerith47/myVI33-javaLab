package Lab3.Part2;

public class Lab3_2_3 {
    public static void main(String[] args) {
        String str = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";

        System.out.println(replaceSecondPhrase(str));
    }

    public static String replaceSecondPhrase(String str){
        String tofind = "Object-oriented programming".toLowerCase();
        String replace = "OOP";

        int count = 0;
        int index = 0;
        StringBuilder sb = new StringBuilder(str.toLowerCase());
        while ( index != -1){
            index = sb.indexOf(tofind, index);
            if (index != -1){
                count ++;
                if (count %2 == 0){
                    sb.replace(index, index + tofind.length(), replace);
                }
                index +=tofind.length();
            }
        }
        return sb.toString();
    }
}
