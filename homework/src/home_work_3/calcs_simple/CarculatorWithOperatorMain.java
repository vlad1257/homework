package home_work_3.calcs_simple;

import home_work_3.calcs_simple.CalculatorWithOperator;


//ответы в задании 1(13081.81) и задании 2(13156.089) отличаются,веротяно из-за разной последовательности подсчёта
public class CarculatorWithOperatorMain {
    public static void main(String [] args){
        CalculatorWithOperator calculatorWithOperator1 = new CalculatorWithOperator();
        CalculatorWithOperator calculatorWithOperator2 = new CalculatorWithOperator();


        calculatorWithOperator1.setUmnozenie(15,7);
        calculatorWithOperator1.setDelenie(28,5);
        calculatorWithOperator1.setSlozenie(4.1, calculatorWithOperator1.getUmnozenie());
        calculatorWithOperator2.setSlozenie(calculatorWithOperator1.getSlozenie(),calculatorWithOperator1.getDelenie());
        calculatorWithOperator2.setPow(calculatorWithOperator2.getSlozenie(),2);






        System.out.println(calculatorWithOperator2.getPows() );








    }
}
