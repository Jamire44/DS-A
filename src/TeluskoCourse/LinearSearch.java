package TeluskoCourse;

import java.lang.reflect.Array;
import java.util.List;

public class LinearSearch {

    public static void main(String[] args) {

        int[] newArray = {1,2,3,5,7,8,9,11,12};

        int index = binarySearch(newArray, 8);

        if (index != -1) {
            System.out.println("Number found at position: " + index);
        } else{
            System.out.println("Shush!");
        }
    }

    public static int binarySearch(int[] arrayOfNumbers, int target){

        int l = 0;
        int r = arrayOfNumbers.length - 1;

        while(l <= r){

            int mid = l + ((r - l) / 2);
            if (arrayOfNumbers[mid] == target){
                return mid;
            }

            else if(arrayOfNumbers[mid] < target){
                l = mid + 1;
            }

            else if(arrayOfNumbers[mid] > target){
                r = mid - 1;
            }
        }
        return -1;

    }

    public static int linearSearching(int[] items, int range){
        int lengthOfArray = items.length - 1;

        for (int i = 0; i < lengthOfArray; i++) {
            if(items[i] == range){
                return i;
            }
        }
        return -1;
    }



}//class
