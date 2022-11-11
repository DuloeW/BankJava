package com.java.service;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Login {
    
    public void isValidAccount(Register personRegister, String nickName, String password) throws IOException {
        File fileDataBase;

        // read file person, if filePerson is undifind it will be return out
        try {
            fileDataBase = new File("src/com/java/db/register/person.txt");
        } catch (Exception e) {
            System.err.println("Database is not found");
            return;
        }
        // checking user nickName and password from user input
        String nickPass = String.format("%s %s", nickName, password);
        String[] keywords = nickPass.split("\\s+");
        findPersonAccount(keywords, personRegister);
    }

    public void findPersonAccount(String[] keywords, Register personRegister) throws IOException {
        FileReader fileInput;
        BufferedReader bufferInput;
        String name;
        String pass;
        String email;
        String phone;
        String data;
        boolean isFind;
        boolean isExist;

        fileInput = new FileReader("src/com/java/db/register/person.txt");
        bufferInput = new BufferedReader(fileInput);
        data = bufferInput.readLine();
        isFind = false;
        StringTokenizer stringToken = new StringTokenizer(",");
        while(data != null) {

            isExist = true;

            System.out.println(data);
            System.out.println(Arrays.toString(keywords));
            for (String keyword : keywords) {
                isExist = isExist && data.toLowerCase().contains(keyword.toLowerCase());
            }
           

            if(isExist) {
                name = stringToken.nextToken();
                pass = stringToken.nextToken();
                email = stringToken.nextToken();
                phone = stringToken.nextToken();
                
                if(personRegister.getNickName().equalsIgnoreCase(name) && personRegister.getPassword().equalsIgnoreCase(pass)) {
                    isFind = true;
                    System.out.println(isFind);
                }
            }

            data = bufferInput.readLine();
        }
        // return isFind;
    }
}
