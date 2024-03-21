package home_work_3.calcs_simple;


 //3. Создать класс CalculatorWithMathCopy.
 //	3.1 Все методы объявленные в данном классе НЕ статические (не имеют модификатор static).
 //	3.2 В классе должны присутствовать математические методы:
 //		3.2.1 4 базовых математических метода (деление, умножение, вычитание, сложение). Скопировать базовые математические операции из CalculatorWithOperator.
 //		3.2.2 3 метода (Возведение в целую степень дробного положительного числа, Модуль числа, Корень из числа). Данные методы должны содержать в своём теле вызов библиотеки Math и возврат полученного результата.
 //	3.3 Создать класс CalculatorWithMathCopyMain в котором будет точка входа (main метод). В main методе требуется создать экземпляр калькулятора и используя методы из данного экземпляра посчитать выражения из задания 1. Вывести в консоль результат.

public class CalculatorWithMathCopy extends CalculatorWithOperator {

    @Override
    public double getSlozenie(){
        return super.getSlozenie();
    }

    @Override
    public double getVyczitanie() {
        return super.getVyczitanie();
    }

    @Override
    public double getDelenie() {
        return super.getDelenie();
    }

    @Override
    public double getUmnozenie() {
        return super.getUmnozenie();
    }

    private double squrt;



    public double getSqurt(){

        return squrt;

    }
    public void setSqurt(double a) {
        this.squrt = Math.sqrt(a);
    }


    private double Pows;

    public double getPows() {
        return Pows;
    }

    public void setPows(double a,double b){
        this.Pows = Math.pow(a,b);
    }

    private double Abs;

    public double getAbs(){
        return Abs;
    }

    public void setAbs(double a){
        this.Abs = Math.abs( a);
    }




}
