package Home_work_1;

public class Task2 {
    public static void main(String[] args) {
        int result1 = 5 + 2 / 8; //первым идет / согласно таблице приоритетов,результат 5.25,но java отсекает остаток в переменной int пожтому 5

        int result2 = (5 + 2) / 8; //первыми идут скобки согласно таблице приоритетов,результат 0 с остатком,в терминале будет 0

       // int result3 = (5 + 2++) / 8; //результатом будет ошибка,так как унарнаные операторы работают только с указанными переменными

        //int result4 = (5 + 2++) / --8; //переменные relust3,result4,result5,result6 и result7 выдадут ошибку при компиляции из-за отсутсвия указанных переменных для унарных операторов

       // int result5 = (5 * 2 >> 2++) / --8;

       // int result6 = (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8;

       // int result7 = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8;

        boolean result8 =  6 - 2 > 3 && 12 * 12 <= 119;//первым выполняем *,потом -,>,<= .результатом будет false
        boolean result9 = true && false;// тут также будет false
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result8);
        System.out.println(result9);
    }
}