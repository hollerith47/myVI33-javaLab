package Lab3.Part2;

public class Lab3_2_5 {
    public static void main(String[] args) {
        formattedString("Макиэсэ Герман", 4, "Программирование");
    }
    public static void formattedString(String lastName, int grade, String subject) {
        System.out.printf("Студент %-15s получил %3d по %-10s", lastName, grade, subject).println();
    }
}
