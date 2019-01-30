package com.company;
import java.util.Random;


public class Password {

    private static final String big_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String small_chars = "abcdefghijklmnopqrstuvwxyz";



    Random rand = new Random();
    private String password = "";


    public String generatePassword(int len, boolean use_big, boolean use_small) {

        String charString = "";

        if(use_big) charString += big_chars;
        if(use_small) charString += small_chars;

        char[] chars = charString.toCharArray();

        for (int i = 0; i < len; i++) {
            password += chars[rand.nextInt(charString.length())];
        }
        return password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
