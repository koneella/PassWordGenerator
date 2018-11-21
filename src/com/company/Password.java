package com.company;
import java.util.Random;


public class Password {

    private static final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    private String password = "";

    Random rand = new Random();


    public String generatePassword(int n) {
        for (int i = 0; i < n; i++) {
            password += chars.charAt(rand.nextInt(chars.length()));
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
