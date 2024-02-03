package Algorithms;/*
//Jamie Doyle
//01:31:14/12/2023
//Project : 
*/

public class BubbleSorting {
    public static void main(String[] args) {

        int[] array = {9,5,2,6,6,7,4,8};

        bubbleSort(array);

        for (int i : array){
            System.out.print(i);
        }

    }//main

    public static void bubbleSort(int array[]) {

        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - i - 1; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}//class
