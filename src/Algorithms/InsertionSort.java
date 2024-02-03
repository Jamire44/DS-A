package Algorithms;/*
//Jamie Doyle
//21:40:15/12/2023
//Project : 
*/

public class InsertionSort {
    public static void main(String[] args) {

        int array[] = {9,1,8,2,7,3,5,4,8};

        insertionSorted(array);

        for(int i : array){
            System.out.println(i + " ");
        }


    }//main

    private static void insertionSorted(int[] array) {

        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;
            while(j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }

    }
}//class
