package Algorithms;/*
//Jamie Doyle
//16:11:12/12/2023
//Project : 
*/

public class LinearSearch {
    public static void main(String[] args) {

        int[] array = {6,3,6,8,4,2,7,8,3,7,3,11};
        int index = linearSearch(array, 6);

        if (index != -1){
            System.out.println("Element found at index: " + index);
        }
        else {
            System.out.println("Element not found!");
        }



    }//main

    private static int linearSearch(int[] array, int value) {

        for(int i = 0; i < array.length; i++){
            if (array[i] == value){
                return i;
            }
        }

        return -1;
    }
}//class
