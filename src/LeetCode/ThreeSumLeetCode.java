package LeetCode;/* Created by: Jamie
 * Created on:{01/02/2024}
 * This is a program is:
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumLeetCode {

    public static int[] threeSum(int[] nums, int target) {
        target = 13;
        Arrays.sort(nums);
        int[] resultArray = new int[3]; // Assuming three elements in the result

        for (int i = 0; i < nums.length - 2; i++) {
            int newTarget = target - nums[i];
            int low = i + 1;
            int high = nums.length - 1;

            while (low < high) {
                if (nums[low] + nums[high] == newTarget) {
                    // Store the result in the array
                    resultArray[0] = nums[i];
                    resultArray[1] = nums[low];
                    resultArray[2] = nums[high];
                    return resultArray; // Return the result array
                } else if (nums[low] + nums[high] < newTarget) {
                    low++;
                } else {
                    high--;
                }
            }
        }

        // If no result is found, you may return an array with default values
        return new int[3]; // Modify the size and default values as needed
    }
    
    public static void main(String[] args) {

        int[] nums = {2,7,11,15};

        threeSum(nums, 7);




    }
}
