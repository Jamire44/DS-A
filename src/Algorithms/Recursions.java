package Algorithms;/*
//Jamie Doyle
//17:15:16/12/2023
//Project : 
*/

public class Recursions {
    public static void main(String[] args) {
        
        power(3, 7);
    }

    private static int power(int base, int exponent) {
        if(exponent < 1) return base; // base case
        return base * power(base, exponent - 1); // recursive
    }
}//class
