package home_work_3.calcs_simple;

import home_work_3.calcs_simple.CalculatorWithMathCopy;


public class CalculatorWithMathCopyMain  {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculatorWithMathCopy1 = new CalculatorWithMathCopy();
        CalculatorWithMathCopy calcucatorWithMathCopy2 = new CalculatorWithMathCopy();

        calculatorWithMathCopy1.setUmnozenie(15,7);
        calculatorWithMathCopy1.setDelenie(28,5);
        calculatorWithMathCopy1.setSlozenie(4.1,calculatorWithMathCopy1.getUmnozenie());
        calcucatorWithMathCopy2.setSlozenie(calculatorWithMathCopy1.getSlozenie(), calcucatorWithMathCopy2.getDelenie());
        calcucatorWithMathCopy2.setPows(calcucatorWithMathCopy2.getSlozenie(),2);


        System.out.println(calcucatorWithMathCopy2.getPows());

        //ответ 11902.81,отличается от результатов в задании 1(13081.81) и задании 2(13156.089),веротяно из-за разной последовательности подсчёта





    }
}
