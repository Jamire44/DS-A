package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ShuffleTheArray {
    public static int[] shuffle(int[] nums, int n) {

        List<Integer> xArray = new ArrayList<>();
        List<Integer> yArray = new ArrayList<>();
        List<Integer> newArray = new ArrayList<>();

        for (int i = 0; i < nums.length / 2; i++){
            xArray.add(nums[i]);
        }
        for (int i = nums.length / 2; i < nums.length;i++){
            yArray.add(nums[i]);
        }

        for (int i = 0; i < xArray.size(); i++){
            newArray.add(xArray.get(i));
            newArray.add(yArray.get(i));
        }


        int[] intArray = new int[newArray.size()];
        for (int i = 0; i < newArray.size(); i++) {
            intArray[i] = newArray.get(i);
        }


        return intArray;

    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,4,3,2,1};
        System.out.println(shuffle(nums, 4));

    }
}
