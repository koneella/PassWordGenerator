package com.company;
import java.util.Random;


public class Password {

    private static final String big_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String small_chars = "abcdefghijklmnopqrstuvwxyz";
    private static final String numbers = "0123456789";



    Random rand = new Random();
    private String password = "";


    public String generatePassword(int len, boolean use_big, boolean use_small, boolean use_numbers) {

        String charString = "";

        if(use_big) charString += big_chars;
        if(use_small) charString += small_chars;
        if(use_numbers) charString += numbers;

        char[] chars = charString.toCharArray();

        for (int i = 0; i < len; i++) {
            password += chars[rand.nextInt(charString.length())];
        }
        return password;
    }

}
