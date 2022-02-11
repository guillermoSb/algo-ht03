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
    public ArrayList<Integer> mergeSort(ArrayList<Integer> unsortedList)
    {
        if(unsortedList.size() <= 1)
        {
            return unsortedList;
        }
        ArrayList<Integer> sortedList = new ArrayList<Integer>();

        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        int middle = unsortedList.size()/2;
        //Se separa el arreglo
        for(int i = 0; i < unsortedList.size(); i++)
        {
            if(i < middle)
            {
                left.add(unsortedList.get(i));
            }
            else
            {
                right.add(unsortedList.get(i));
            }
        }
        left = mergeSort(left);
        right = mergeSort(right);
        //Se combinan los arreglos
        sortedList = merge(left, right);
        return sortedList;
    }

    public ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right)
    {
        ArrayList<Integer> mergedList = new ArrayList<Integer>();
        while(left.size() > 0 || right.size() > 0)
        {
            if(left.size() > 0 && right.size() > 0)
            {
                if(left.get(0) < right.get(0))
                {
                    mergedList.add(left.get(0));
                    left.remove(0);
                }
                else
                {
                    mergedList.add(right.get(0));
                    right.remove(0);
                }
            }
            else if(left.size() > 0)
            {
                mergedList.add(left.get(0));
                left.remove(0);
            }
            else if(right.size() > 0)
            {
                mergedList.add(right.get(0));
                right.remove(0);
            }
        }
        return mergedList;
    }

    /**
     * Metodo  para realizar el ordenamiento tipo quick sort
     */

    public ArrayList<Integer> quicksort(ArrayList<Integer>a, int izq, int der) {

        int pivote=a.get(izq); // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        int aux;

        while(i < j){                          // mientras no se crucen las búsquedas
            while(a.get(i)<= pivote && i < j) i++; // busca elemento mayor que pivote
            while(a.get(j) > pivote) j--;           // busca elemento menor que pivote
            if (i < j) {                        // si no se han cruzado
                aux= a.get(i);                      // los intercambia
                a.set(i,a.get(j));
                a.set(j,aux);
            }
        }

        a.set(izq, a.get(j));      // se coloca el pivote en su lugar de forma que tendremos
        a.set(j, pivote);      // los menores a su izquierda y los mayores a su derecha

        if(izq < j-1)
            quicksort(a,izq,j-1);          // ordenamos subarray izquierdo
        if(j+1 < der)
            quicksort(a,j+1,der);          // ordenamos subarray derecho
        return a;
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
