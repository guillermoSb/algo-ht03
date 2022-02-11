package com.ht03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Algoritmos y Estructuras de Datos
 * Universidad del Valle de Guatemala
 * Hoja de Trabajo No.3
 * @file Main.java
 * @author Aaron Beltran  21092
 * @author Mariel Guamuche 21150
 * @author Sebastian Reyes 21139
 * @author Guillermo Santos 191517
 */

public class Main {

    public static void main(String[] args) {
        FileManager manager = new FileManager();
        Sorting sorting = new Sorting();
        int limite = 10;
        try {
//            List nums = manager.readFile("numbers.txt").subList(0, limite);
            List nums = crearNumerosOrdenados().subList(0, limite);
            sorting.radixSort(new ArrayList<>(nums), 4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Integer> crearNumerosOrdenados() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i <= 3000; i++) {
            nums.add(i);
        }
        return nums;
    }
}



