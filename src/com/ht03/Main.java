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
        try {
            // Merge Sort
            ArrayList<Integer> sortedM =  sorting.mergeSort(manager.readFile("numbers.txt"));
            System.out.println("Merge Sort: " + sortedM);
            // Merge Sort
            ArrayList<Integer> sortedR =  sorting.radixSort(manager.readFile("numbers.txt"), 4);
            System.out.println("Radix Sort: " + sortedR);
            // Bubble Sort
            ArrayList<Integer> sortedB =  sorting.bubbleSort(manager.readFile("numbers.txt"));
            System.out.println("Bubble Sort: " + sortedB);
            // Bubble Sort
            ArrayList<Integer> quickSort =  sorting.quickSort(manager.readFile("numbers.txt"));
            System.out.println("Quick Sort: " + quickSort);
            // Bubble Sort
            ArrayList<Integer> gnomeSort =  sorting.Gnomesort(manager.readFile("numbers.txt"));
            System.out.println("Gnome Sort: " + gnomeSort);
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



