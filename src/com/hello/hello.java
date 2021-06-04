package com.hello;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class hello {
    public static void main(String[] args) {
        System.out.println();
        ss(1);
    }


    public static void ss(Integer s) {
        try {
            FileInputStream fis = new FileInputStream("hollo");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}
