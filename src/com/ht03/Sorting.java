package com.ht03;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Vector;

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
    public ArrayList<Integer> Gnomesort(ArrayList<Integer> arr) {
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
                arr.set(index, arr.get(index - 1));
                arr.set(index - 1, temp);
                index--; // se reduce el índice
            }
        }
        return arr;
    }

    /**
     * Metodo para realizar el ordenamiento tipo merge sort
     */
    public ArrayList<Integer> mergeSort(ArrayList<Integer> arr) {
        Integer inputsize = arr.size();// se nombra una variable que contenga el tamaño del arreglo
        if (inputsize < 2) {
            return arr;
        }
        Integer midIndex = inputsize / 2;// se divide el tamanio del arreglo en dos
        ArrayList<Integer> izmitad = new ArrayList<>(midIndex); // se crea arreglo que contiene la mitad izquierda
        ArrayList<Integer> demitad = new ArrayList<>(inputsize - midIndex);// se crea arreglo que contiene la mitad derecha
        // se recorren los arreglos y se les agrega el contenido del arreglo original
        for (int i = 0; i < midIndex; i++) {
            izmitad.add(arr.get(i));
        }
        for (int i = midIndex; i < inputsize; i++) {
            demitad.add(arr.get(i));
        }
        mergeSort(izmitad);
        mergeSort(demitad);
        int ladoizq = izmitad.size();// se crea variable para el tamanio del arreglo del lado izquierdo
        int ladoder = demitad.size();// se crea variable para el tamanio del arreglo del lado derecho
        int i = 0, j = 0, k = 0;
        while (i < ladoizq && j < ladoder) {
            if (izmitad.get(i) <= demitad.get(j)) {
                arr.add(izmitad.get(i)); // cuando ambas mitades contengan mas de o elementos se cumple la condicion
                i++;
            }// la condicion permite que se regresen los elementos ya ordenados al arreglo original
            else {
                arr.add(demitad.get(j));
                j++;
            }
            k++;
        }
        while (i < ladoizq) {
            arr.add(izmitad.get(i));// cuando se de cumpla el caso con el lado izquierdo, se agregan los elementos de este
            i++;
        }
        while (j < ladoder) {
            arr.add(demitad.get(j));//cuando se de cumpla el caso con el lado derecho, se agregan los elementos de este
            j++;
        }

        return arr; // se regresa el arreglo ordenado
    }

    /**
     * Metodo  para realizar el ordenamiento tipo quick sort
     */
    public ArrayList<Integer> quickSort(ArrayList<Integer> arr) {
        int izq = 0;
        int pivote = arr.size(); // se obtiene el tamaño del arraylist
        int i = izq;         // i realiza la búsqueda de izquierda a derecha
        int der = 0;
        int j = der;         // j realiza la búsqueda de derecha a izquierda
        int aux;

        while (i < j) {                          // mientras no se crucen las búsquedas
            while (i <= pivote && i < j) i++; // busca elemento mayor que pivote
            while (j > pivote) j--;           // busca elemento menor que pivote
            if (i < j) {                        // si no se han cruzado
                aux = i;                      // los intercambia
                i = j;
                j = aux;
            }
        }

        izq = j;      // se coloca el pivote en su lugar de forma que tendremos
        j = pivote;      // los menores a su izquierda y los mayores a su derecha

        if (izq < j - 1)
            quickSort(izq, j - 1);          // se ordena subarray izquierdo
        if (j + 1 < der)
            quickSort(j + 1, der);          // se ordena subarray derecho

        return arr;
    }

    private void quickSort(int i, int der) {
    }


    /**
     * Metodo para realizar el ordenamiento tipo raidix sort
     */
    public ArrayList<Integer> radixSort(ArrayList<Integer> numbers, int maxNumberDigits){
        for (int i = 0; i < maxNumberDigits; i++) {
            int x,j;
            int value;
            Vector<Vector<Integer>> bucket = new Vector<Vector<Integer>>(10);
            bucket.setSize(10);
            for (j = 0; j<10;j++) bucket.set(j, new Vector<Integer>());
            int n = numbers.size();
            for (x = 0; x<n; x++) {
                value = numbers.get(x);
                j = digit(value, i);
                bucket.get(j).add(value);
            }
            x = n;

            for (j =9; j>=0; j--) {
                while (!bucket.get(j).isEmpty()) {
                    x--;
                    value = bucket.get(j).remove(bucket.get(j).size() - 1);
                    numbers.set(x, value);
                }
            }
        }
        return numbers;
    }

    /**
     * Metodo para obtener el valor de un digito d en un numero n
     * @param n >= 0
     * @param d >= 0
     * @return
     */
    private int digit(int n, int d) {
        if (d==0) return n % 10;
        else return digit(n/10, d-1);
    }


    /**
     * Método para realizar el ordenamiento tipo bubble sort
     */
    public ArrayList<Integer> bubbleSort(ArrayList<Integer> arr) {
        int m = arr.size(); // contra quien se compara
        for (int p = m-1; p >= 1; --p) { //recorre de atras hacia adelante
            for (int i = 0; i <= p-1; i++) { // recorre de adelante hacia atras
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
