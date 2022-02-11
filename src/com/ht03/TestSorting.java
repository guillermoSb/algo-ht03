package com.ht03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class TestSorting {

    Sorting sorting = new Sorting();

    private ArrayList<Integer> createNums() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(30);
        nums.add(20);
        nums.add(10);
        nums.add(3);
        nums.add(2);
        nums.add(15);
        nums.add(1);
        nums.add(4);
        nums.add(4);
        return nums;
    }
    private ArrayList<Integer> expectedSortedNums() {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(4);
        nums.add(10);
        nums.add(15);
        nums.add(20);
        nums.add(30);
        return nums;
    }
    @Test
    public void testGnomeSort() {
        ArrayList<Integer> sortedNums = sorting.Gnomesort(createNums());
        System.out.println(sortedNums);
        assertEquals(expectedSortedNums(),sortedNums);
    }

    @Test
    public void testMergeSort() {
        ArrayList<Integer> sortedNums = sorting.mergeSort(createNums());
        System.out.println(sortedNums);
        assertEquals(expectedSortedNums(),sortedNums);
    }

    @Test
    public void testRadixSort() {
        ArrayList<Integer> sortedNums = sorting.radixSort(createNums(), 2);
        System.out.println(sortedNums);
        assertEquals(expectedSortedNums(),sortedNums);
    }

    @Test
    public void testBubbleSort() {
        ArrayList<Integer> sortedNums = sorting.bubbleSort(createNums());
        System.out.println(sortedNums);
        assertEquals(expectedSortedNums(),sortedNums);
    }


    @Test
    public void testQuickSort() {
        ArrayList<Integer> sortedNums = sorting.quickSort(createNums());
        System.out.println(sortedNums);
        assertEquals(expectedSortedNums(),sortedNums);
    }
}
