package Home_work_1;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a = scanner.nextInt(); //число 42 в битовом виде 00101010

        System.out.println("Введите второе число:");
        int b = scanner.nextInt(); //число 15 в битовом виде 00001111

        int and = a & b;
        int or = a | b;

        System.out.println("Результат  И: " + and);
        System.out.println("Результат ИЛИ: " + or);


    }
}
