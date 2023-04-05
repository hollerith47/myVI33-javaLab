package Lab1_1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class var5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Entrez le texte : ");
        String text = userInput.nextLine();
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        StringBuilder textWithIndexes = new StringBuilder();
        StringBuilder indexes = new StringBuilder();
        List<String> list = new ArrayList<String>();

        int n = 0;
        System.out.println(text.toLowerCase().toCharArray());
        /*
        for (char c : text.toLowerCase().toCharArray()) {
            if (alphabet.indexOf(c) != -1) {
                int index = alphabet.indexOf(c) + 1;
                textWithIndexes.append(index).append("  ");
                indexes.append(c).append(" ");
                list.add();
                if (index >= 10) {
                    textWithIndexes.append(" ");
                }
            } else {
                textWithIndexes.append(c).append("  ");
            }
        }

        //System.out.printf("%s %s", indexes, textWithIndexes);
        System.out.println(textWithIndexes);
        System.out.println(indexes);
//        System.out.println(text);
        for (int i=1; i<= indexes.length(); i++) {
            if (i% 2 != 0){
                System.out.println(indexes[i]);
            }
        }*/
    }
}
