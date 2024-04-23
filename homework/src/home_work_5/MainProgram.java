package home_work_5;

import home_work_5.*;
import home_work_5.RandomGenerates.ForAnimalNick;
import home_work_5.RandomGenerates.ForName;
import home_work_5.RandomGenerates.ForPersonNick;

public class MainProgram {
    public static void main(String[] args) {
        ForName fn = new ForName();
        ForPersonNick rpn = new ForPersonNick();
        ForAnimalNick fan = new ForAnimalNick();

        String randomstringname = ForName.RandomString(7);
        String russianrandomstring = ForName.RandomRussianString(4);
        String randomname = ForName.RandomName();

        String randomstringname1 = ForAnimalNick.RandomString(5);
        String russianrandomstring1 = ForName.RandomRussianString(4);
        String randomanimalnick = ForAnimalNick.RandomAnimalNick();

        String nrandomstrig = ForPersonNick.RandomString(9);
        String englishrandomstring = ForPersonNick.RandomStringLetters(7);




        System.out.println(randomstringname);
        System.out.println(russianrandomstring);
        System.out.println(randomname);
        System.out.println(randomstringname1);
        System.out.println(russianrandomstring1);
        System.out.println(randomanimalnick);
        System.out.println(nrandomstrig);
        System.out.println(englishrandomstring);

    }
}
