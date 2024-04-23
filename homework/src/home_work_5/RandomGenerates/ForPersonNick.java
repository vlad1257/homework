package home_work_5.RandomGenerates;

import java.util.Random;

public class ForPersonNick {
    public static String RandomString(int length) {
        String letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder(length);
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(letter.charAt(rnd.nextInt(letter.length())));
        }
        return sb.toString();
    }
    public static String RandomStringLetters(int length) {
        String letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(length);
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(letter.charAt(rnd.nextInt(letter.length())));
        }
        return sb.toString();
    }
}
