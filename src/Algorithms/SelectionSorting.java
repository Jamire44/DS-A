package Algorithms;/*
//Jamie Doyle
//21:47:14/12/2023
//Project : 
*/

public class SelectionSorting {
    public static void main(String[] args) {

        int array[] = {8,7,9,2,3,1,3,6};

        selectionSort(array);

        for(int i : array){
            System.out.println(i);
        }

    }//main

    private static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++){
            int min = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[min] > array[j]){
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}//class
