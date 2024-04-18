package test.home_work_3;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

import org.junit.jupiter.api.Test;

import java.util.Objects;

public class calculatorTest {
    @Test
    public  void testFunctions() {
        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();

          double a = calc.sqrt(56);
          double b = calc.abs(50);
          double c = calc.pow(45,2);
          double d =  calc.slozenie(15,15);
          double e = calc.vyczitanie(45,30);

          double [] arr = {a,b,c,d,e};
          for (double i : arr ){
              if(Objects.equals("String" ,arr)){
                  System.out.println("Ответ не число");

              } else {
                  System.out.println("Ответ число");
              }


          }













   }





}
