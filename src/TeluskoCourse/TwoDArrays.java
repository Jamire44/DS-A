package TeluskoCourse;/* Created by: Jamie
 * Created on:{01/02/2024}
 * This is a program is:
 */

public class TwoDArrays {
    public static void main(String[] args) {

        int[][] nums = new int[4][4];

        // Assigning random values to the 2D Array
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length;j++){
                nums[i][j] = (int)(Math.random() * 100);
            }
        }

//        for (int i = 0; i < nums.length;i++){
//            for (int j = 0; j < nums[i].length; j++){
//                if (nums[i][j] % 2 == 0){
//                    nums[i][j] = 69;
//                }
//            }
//        }

        // Iterating through a 2D Array
        for (int i = 0; i < nums.length;i++){
            for (int j = 0; j < nums[i].length;j++){
                    System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }

}//class
