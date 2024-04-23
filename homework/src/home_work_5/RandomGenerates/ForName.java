package home_work_5.RandomGenerates;

import java.util.Random;

public class ForName {

    public static String RandomString(int length) {
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder(length);
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(letters.charAt(rnd.nextInt(letters.length())));
        }
        return sb.toString();

    }

    public static String RandomRussianString(int length) {
        String characters = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        StringBuilder sb = new StringBuilder(length);
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(rnd.nextInt(characters.length())));
        }
        return sb.toString();
    }

    public static String RandomName(){


        String [] names = new String[] {"Алёна", "Александра", "Алина", "Анастасия", "Ангелина",
                "Анна", "Валентина", "Валерия", "Вероника", "Виктория",
                "Галина", "Дарья", "Екатерина", "Елена", "Ирина",
                "Карина", "Кристина", "Лариса", "Маргарита", "Марина",
                "Мария", "Надежда", "Наталья", "Ольга", "Светлана","Александр", "Алексей", "Анатолий", "Андрей", "Артем",
                "Борис", "Вадим", "Валентин", "Василий", "Виктор",
                "Владимир", "Вячеслав", "Георгий", "Денис", "Дмитрий",
                "Евгений", "Иван", "Игорь", "Константин", "Максим",
                "Михаил", "Никита", "Олег", "Павел", "Сергей"};
        Random rnd = new Random(names.length);


        return rnd.toString();

    }
}