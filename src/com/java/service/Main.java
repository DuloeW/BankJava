package com.java.service;

import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
        // regisTer.setEmail("BayuGelegl@gmail.com");
        // String regis = regisTer.getEmail();
        // System.out.println(regis);
        // String bayu = "Bayu";
        // String wiyantara = "witantara";
        // String gabungan = String.format("%s %s", bayu, wiyantara);
        // System.out.println(gabungan);
        //======testing

        Register register = new Register();
        Login login = new Login();
        register.setNickName("bayu");
        register.setPassword("123haud");
        register.setEmail("bayu@gmail.com");
        register.setPhoneNumber("1281921927128");

        login.isValidAccount(register, register.getNickName(), register.getPassword());

    }
}
