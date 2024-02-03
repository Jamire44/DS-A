package TeluskoCourse;/* Created by: Jamie
 * Created on:{30/01/2024}
 * This is a program is:
 */

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {4,2,5,3,7,9,8,1};
        int len = nums.length;

        for (int i = 1; i < len; i++){
            int key = nums[i];
            int j = i - 1;

            while (j>=0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }

        for (int num : nums){
            System.out.print(num + " ");
        }

    }

}//class
