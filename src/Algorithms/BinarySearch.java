package Algorithms;/*
//Jamie Doyle
//16:50:12/12/2023
//Project : 
*/

import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {

        int array[] = new int[1000000];
        int target = 677802;

        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }

        //int index = Arrays.binarySearch(array, target);
        int index = binarySearchs(array, target);

        if (index == -1){
            System.out.println(target + " not found");
        }
        else{
            System.out.println("Element found at: " + index);
        }
        

    }//main

    private static int binarySearchs(int[] array, int target) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high){
            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("Middle: " + value);

            if (value < target) low = middle + 1;
            else if (value > target) high = middle - 1;
            else return middle; // target is found

        }

        return -1;
    }
}//class
