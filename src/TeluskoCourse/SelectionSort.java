package TeluskoCourse;/* Created by: Jamie
 * Created on:{29/01/2024}
 * This is a program is:
 */

public class SelectionSort {

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 7, 2, 8, 4};
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;

        System.out.println("Before Sorting");
        for (int num : nums){
            System.out.print(num + " ");
        }

        for(int i = 0; i < size - 1; i++){
            minIndex = i;

            //Finding Minimum value
            for (int j = i + 1; j < size; j++){
                if (nums[minIndex] > nums[j]){
                    minIndex = j;
                }
            }

            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }




        System.out.println("\n");
        System.out.println("After Sorting");
        for (int num : nums){
            System.out.print(num + " ");
        }
    }



}//class
