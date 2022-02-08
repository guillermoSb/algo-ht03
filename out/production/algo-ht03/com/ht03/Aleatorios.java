package com.ht03;

import java.util.ArrayList;
import java.util.Random;

/**
 * Genera números aleatorios entre 0 y 1000.
 * @author Mariel Guamuche 21150
 */
public class Aleatorios {
    /**
     * Genera números aleatorios con cantidad máxima indicada
     * @param n cantidad de números aleatorios
     * @return Arraylist númerico con los números aleatorios
     */
    public static ArrayList<Integer> aleatorios(int n) {
        Random rnd = new Random();
        ArrayList<Integer> resultado = new ArrayList();
        if (n < 10 || n>3000) {
            n=10; // en caso de que se exceda o no llegue al valor mínimo, entonces el valor n es 10
        }
        for (int i = 0; i < n; i++) {
            resultado.add(rnd.nextInt(1000));
        }
        return resultado;
    }
}
