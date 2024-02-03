package Algorithms;/*
//Jamie Doyle
//20:51:13/12/2023
//Project : 
*/

public class InterpolationSearch {
    public static void main(String[] args) {

        int[] array = {1,2,4,8,16,32,64,128,256,512,1024,2048,4096};

        int index = interpolationSearch(array, 515);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Nah");
        }
    }//main

    private static int interpolationSearch(int[] array, int values) {

        int high = array.length - 1;
        int low = 0;

        while(values >= array[low] && values <= array[high] && low <= high){

            int probe = low + (high - low) * (values - array[low]) /
                        (array[high] - array[low]);

            System.out.println("probe: " + probe);

            if (array[probe] == values){
                return probe;
            }
            else if (array[probe] < values){
                low = probe + 1;
            }
            else{
                high = probe - 1;
            }
            
        }


        return -1;
    }
}//class
