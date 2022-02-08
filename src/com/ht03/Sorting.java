package com.ht03;

import javax.swing.*;
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
    public ArrayList<Integer> mergeSort(ArrayList<Integer> arr){
        Integer inputsize = arr.size();// se nombra una variable que contenga el tamaño del arreglo
        if (inputsize < 2){
            return arr;
        }
        Integer midIndex = inputsize/2;// se divide el tamanio del arreglo en dos
       ArrayList <Integer> izmitad = new ArrayList<>(midIndex); // se crea arreglo que contiene la mitad izquierda
       ArrayList <Integer> demitad = new ArrayList<>(inputsize-midIndex);// se crea arreglo que contiene la mitad derecha
        // se recorren los arreglos y se les agrega el contenido del arreglo original
        for (int i =0 ; i< midIndex; i++){
            izmitad.add(arr.get(i));
        }
        for (int i= midIndex; i<inputsize; i++ ){
            demitad.add(arr.get(i));
        }
        mergeSort(izmitad);
        mergeSort(demitad);
        int ladoizq = izmitad.size();// se crea variable para el tamanio del arreglo del lado izquierdo
        int ladoder = demitad.size();// se crea variable para el tamanio del arreglo del lado derecho
        int i=0 , j =0, k=0;
        while(i < ladoizq && j< ladoder){
            if (izmitad.get(i)<= demitad.get(j))
            { arr.add(izmitad.get(i)); // cuando ambas mitades contengan mas de o elementos se cumple la condicion
                i++;}// la condicion permite que se regresen los elementos ya ordenados al arreglo original
            else{
                arr.add(demitad.get(j));
                j++;}
            k++;}
        while (i< ladoizq){
            arr.add(izmitad.get(i));// cuando se de cumpla el caso con el lado izquierdo, se agregan los elementos de este
            i++;
        }
        while (j< ladoder){
            arr.add(demitad.get(j));//cuando se de cumpla el caso con el lado derecho, se agregan los elementos de este
            j++;
        }

        return arr; // se regresa el arreglo ordenado
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
