package home_work_5.RandomGenerates;

import java.util.Random;

public class ForAnimalNick {
    public static String RandomString(int length) {
        String letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder(length);
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(letter.charAt(rnd.nextInt(letter.length())));
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
    public static String RandomAnimalNick() {
        String [] animalNicks = new String [] {"Арчи", "Алиса", "Амадей", "Анфиса", "Арчибальд", "Агата", "Алекс", "Адель", "Армстронг",
                "Алмаз", "Белла", "Борис", "Барон", "Барбара", "Бенедикт", "Бэтти", "Бим", "Бонд", "Бахтияр", "Бруно", "Вилли"
                , "Вальдемар", "Вивьен", "Версачи", "Венди", "Вирджиния"};
        Random rnd = new Random(animalNicks.length);
        return rnd.toString();
    }
}
