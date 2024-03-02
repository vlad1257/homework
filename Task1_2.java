package home_page_2.loops;
/* 1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080

 */

public class Task1_2 {
        public static void main(String[] args) {
           String a = "181232375";
           long b = Long.parseLong(a);

           if(b == 0) {
               System.out.println(0);
               return;
           }


           byte [] dig = new byte[a.length()];

           int i = dig.length;
           long result = 1;
            while (b != 0){
                long digit = b % 10;
                dig[--i] = (byte)digit;
                result *= digit;
                b /= 10;
            }

            int j = 0;
            for(byte digit:dig ) {
                System.out.print(digit);
                if (++j < dig.length) {
                System.out.print(" * ");
                }

            }
            System.out.print(" = " + result);
        }


    }

