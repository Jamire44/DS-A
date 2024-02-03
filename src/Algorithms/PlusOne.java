package Algorithms;/*
//Jamie Doyle
//15:26:19/01/2024
//Project : 
*/

import java.util.*;

public class PlusOne {


    public static void main(String[] args) {

        int[] nums = {4,0,5,3,2,0,4,0,0,0,0,0,4};

        Queue<Integer> queue = new LinkedList<Integer>();
        for(int num : nums){
            if(num != 0){
                queue.offer(num);
            }
        }

        for(int num : nums){
            if (num == 0) {
                queue.offer(num);
            }
        }
        System.out.println("My list: " + queue);
    }
}//class
