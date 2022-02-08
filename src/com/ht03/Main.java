package com.ht03;

import java.util.ArrayList;

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
        ArrayList numbers = new ArrayList();
        try {
            manager.readFile("numbers.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
