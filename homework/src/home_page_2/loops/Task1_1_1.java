package home_page_2.loops;
/*
1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
        Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
 */

public class Task1_1_1 {
    public static void main(String[] args) {
        int a = 5;

        int result = 1;
        for(int i = 1; i <= a; i++) {
            result *= i;
            System.out.print(i + " * ");
        }
        System.out.print("= " + result);


    }
}