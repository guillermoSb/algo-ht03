package com.ht03;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FileManager manager = new FileManager();
        ArrayList numbers = new ArrayList();
        try {
            manager.readFile("numbers.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
