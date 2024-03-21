package home_work_3.runners;

//1. Создать класс WithoutCalculatorMain в котором необходимо посчитать следующие выражения:
       // 1.1 4.1 + 15 * 7 + (28 / 5) ^ 2. Вывести сохранённый результат в консоль. Внимание, знак "^" обозначает возведение в степень.

public class WithoutCalculatorMain {
    public static void main(String [] args ){
        double example = 4.1 + 15 * 7 + (28 / 5) ;

        double result =  Math.pow(example, 2);
        System.out.println(result);

    }
}
