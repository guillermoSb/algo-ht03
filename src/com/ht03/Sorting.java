package com.ht03;

import java.util.ArrayList;

public class Sorting {

    /**
     * Compara el valor después del índice y el anterior, si están ordenadas pasará al siguiente dato; sino los ordena
     * y se regresa una posición
     * Sí no hay un valor previo, entonces se mueve una posición,
     * si no hay siguiente valor en el arreglo es porque está ordenado.
     * @param arr
     */
    public void Gnomesort(ArrayList<Integer> arr){
        int index = 0;
        int n = arr.size(); // se obtiene el tamaño del arraylist
        while (index < n) {
            if (index == 0)
                index++; // si el índice es 0 se aumenta en uno para comparar el valor del indice menos 1
            if (arr.get(index) >= arr.get(index - 1))
                index++; // cuando es mayor quiere decir que "está ordenado" y por ello se aumenta en uno
            else {
                int temp = 0; // de lo contrario se cambian de posición
                temp = arr.get(index);
                arr.set(index, arr.get(index-1));
                arr.set(index-1, temp);
                index--; // se reduce el índice
            }
        }
        return;
    }

    public void Mergesort(){}

    public void Quicksort(){}

    public void Radixsort(){}
}
