package Lab3.Part1;

public class Lab3_1_9 {
    public static void main(String[] args) {
            if (args.length < 1) {
                System.out.println("Введите номер задачи от 1 до 8");
                return;
            }
            int taskNumber = Integer.parseInt(args[0]);

            switch (taskNumber) {
                case 1 -> Lab3_1_1.execute(args);
                case 2 -> Lab3_1_2.execute(args);
                case 3 -> Lab3_1_3.execute(args);
                case 4 -> Lab3_1_4.execute(args);
                case 5 -> Lab3_1_5.execute(args);
                case 6 -> Lab3_1_6.execute(args);
                case 7 -> Lab3_1_7.execute(args);
                case 8 -> Lab3_1_8.execute(args);
                default -> System.out.println("Неверный номер задачи. Введите число от 1 до 8.");
            }
        }

}
