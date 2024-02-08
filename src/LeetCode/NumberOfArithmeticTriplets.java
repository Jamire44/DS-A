package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class NumberOfArithmeticTriplets {

    public static int arithmeticTriplets(int[] nums, int diff) {
        // i < j < k
        // nums[j] - nums[i] == diff
        // nums[k] - nums[j] == diff

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++){
            for (int j = 1; j  < nums.length - 1; j++){
                for (int k = 2; k < nums.length; k++){
                    if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff && nums[i] < nums[j] && nums[j] < nums[k] ){
                        list.add(i);
                        list.add(j);
                        list.add(k);
                    }
                }
            }
        }

        int length = list.size() / 3;


        return length;
     }

    public static void main(String[] args) {

        int[] nums = {4,5,6,7,8,9};



        System.out.println(arithmeticTriplets(nums, 2));

    }
}
