
import java.util.InputMismatchException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        
        int n = 0;
        //Ввод количества строк с клавиатуры
        while(true){
            System.out.println("Введите количество строк");
            Scanner sc1 = new Scanner (System.in);
            try{
                n = sc1.nextInt();
                break;
            } catch (InputMismatchException e){
                System.out.println("Вы ввели не число");
            }
            
        }   
    String[] str = new String[n];
    Scanner sc2 = new Scanner(System.in);
    
        //Инициализация массива str строками
    for(int i = 0; i < str.length; i++){
        System.out.println("Введите строку №" + (i+1));
        str[i] = sc2.nextLine();
    }
    float average = 0f;
       //Считаем общую сумму длин строк
        for(String item : str){
            average += (float) item.length();
        }
    //Считаем среднее арифметическое суммы длин этих строк    
    average /= str.length;
        
    System.out.println("Средняя длина строки = (" + average + ")");
               //Выводим результат (выводит все строки имеющие длину ниже средней)
        for(int i = 0; i < n; i++){
            if (str[i].length() < average){
                System.out.println("Строка меньшая чем средняя длина: ");
                System.out.println(str[i] + " ee длина = " + str[i].length());
            }
        }
    
    }
    
 
}