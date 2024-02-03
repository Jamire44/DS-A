package TeluskoCourse;/* Created by: Jamie
 * Created on:{30/01/2024}
 * This is a program is:
 */

import Algorithms.BinarySearch;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {55,33,77,99,34,775,1,772,63};
        int len = array.length;
        int temp = 0;

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int arr : array){
            System.out.print(arr + " ");
        }
    }
}//class
