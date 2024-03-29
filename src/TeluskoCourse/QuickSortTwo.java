package TeluskoCourse;/* Created by: Jamie
 * Created on:{01/02/2024}
 * This is a program is:
 */

public class QuickSortTwo {

    private static void quickSort(int[] array, int low, int high) {

        if (low < high) {

            int pivot = partition(array, low, high);

            quickSort(array, 0, pivot - 1);
            quickSort(array, pivot + 1, high);
        }


    }

    private static int partition(int[] array,int low, int high) {

        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] array = {5,3,5,6,2,8,2,7};

        quickSort(array,0,array.length - 1);

        for (int num : array){
            System.out.print(num + " ");
        }
    }

}//class
