package com.ht03;

import java.util.ArrayList;
/**
 * Clase que contiene la implementacion de los metodos
 * @since 07/febrero/2022
 * @author Aaron Beltran  21092
 * @author Mariel Guamuche 21150
 * @author Sebastian Reyes 21139
 * @author Guillermo Santos 191517
 */

public class Sorting {

    /**
     * Metodo realizar el ordenamiento tipo gnome sort
     */
    public ArrayList<Integer> Gnomesort(ArrayList<Integer> arr){
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
        return arr;
    }

    /**
     * Metodo para realizar el ordenamiento tipo merge sort
     */
    public ArrayList<Integer> mergeSort(){
        return null;
    }
    /**
     * Metodo  para realizar el ordenamiento tipo quick sort
     */
    public ArrayList<Integer>  quickSort(){
        return null;
    }
    /**
     * Metodo para realizar el ordenamiento tipo raidix sort
     */
    public ArrayList<Integer> radixSort(){
        return null;
    }

    /**
     * Método para realizar el ordenamiento tipo bubble sort
     */
    public ArrayList<Integer> bubbleSort(ArrayList<Integer> arr) {
        int m = arr.size(); // contra quien se compara
        for (int p = m-1; p >= 1; --p) { //recorre de atras hacia adelante
            for (int i = 0; i <= p; i++) { // recorre de adelante hacia atras
                if(arr.get(i)>arr.get(i+1)) { // si una posicion anterior es mayor que la siguiente se hace cambio
                    int temp = arr.get(i);
                    arr.set(i, arr.get(i+1));
                    arr.set(i+1, temp);
                }
            }
        }
        return arr; // retorno arreglo ordenado
    }
}
