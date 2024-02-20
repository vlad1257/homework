package Home_work_1;

import java.util.Scanner;
public class Task6 {
    public static void main(String[]args) {
         String b = "Вася";
         String c = "Анастасия";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя");
        String a = scanner.next();
        if (a == b || a == c) {

            System.out.println("Привет!");
            System.out.print("Я тебя так долго ждал");

        } else { ;
            System.out.println("Добрый день,а вы кто?");
        }





    }


}
