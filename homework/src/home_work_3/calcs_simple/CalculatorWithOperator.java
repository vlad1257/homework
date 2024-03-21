package home_work_3.calcs_simple;

//Создать класс CalculatorWithOperator.
//	2.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
//	2.2 В классе должны присутствовать математические методы:
//		2.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение) каждый из этих методов должен принимать два параметра (определитесь с их типами) и должны возвращать результат (определиться с возвращаемым типом результата) при помощи ключевого слово return.
//		2.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Квадратный корень из числа).
//	2.3 В методах можно использовать любые арифметические операторы.
//	2.4 Использование библиотеки Math ЗАПРЕЩЕНО! (кроме извлечения корня). Если у Вас плохо с математикой, то для реализации метода "Квадратный корень из числа" можно воспользоваться библиотекой Math.
//	2.5 Создать класс CalculatorWithOperatorMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат.


public class CalculatorWithOperator extends CarculatorWithOperatorMain {

    private double delenie;

    public  double getDelenie( ){
        return delenie;
    }

    public void setDelenie(double a,double b) {
        delenie = a / b;
    }

    private double umnozenie;

    public double getUmnozenie(){
        return umnozenie;
    }

    public void setUmnozenie(double a,double b){
        umnozenie = a * b;
    }

    private double slozenie;

    public double getSlozenie() {
        return slozenie;
    }

    public void setSlozenie(double a,double b){
        slozenie = a + b;


    }


     private double vyczitanie;

    public double getVyczitanie(){
        return vyczitanie;
    }

    public void setVyczitanie(double a,double b){
        vyczitanie = a - b;
    }



    private double modul;
    public double getModul(){
      return modul;
    }




    public  double setModul(double a) {
        modul = a;
        if (modul == 0) {
            return 0.0 - modul;
        }
        if (modul < 0) {
            return -modul;
        }
        return modul;
    }

   private double pows;

    public double getPows(){
        return pows;
    }


    public double setPow(double value, double powValue){double result = 1;
        for (double i = 1; i <= powValue; i++) {
            result = result * value;
            pows = result;
        }
        return result;
    }






    }
    //джава не приниамает корень,пробовал разные варианты,не понимаю почему











