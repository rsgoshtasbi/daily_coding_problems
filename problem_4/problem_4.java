/*
This problem was asked by Stripe.

Given an array of integers, find the first missing positive integer in linear time and constant space. 
In other words, find the lowest positive integer that does not exist in the array. 
The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.
*/

/*
Self Note: 
1. Linear time is O(n)
2. Constant space is O(1) meaning that the space required by the algorithm to process the data is constant;
   It does not grow with the size of the data on which the algorithm is operating
*/

import java.util.*;
import static java.lang.System.out;

class Problem_4 {
    
    // Runtime Comlexity: O(n + n) = O(n) (good)
    // Space Complexity: 
    static int findMin(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        out.println("Max int in arr = " + max);
        
        int[] new_arr = new int[max];
        
        // O(n)
        for(int i = 0; i < arr.length; i++) {
            if(!(arr[i] <= 0)) {
                new_arr[arr[i]-1] = 1;
            }
        }
        
        // O(n)
        for(int i = 0; i < arr.length; i++) {
            if(new_arr[i] == 0) return i+1;
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {3, 2, 0};
        

        out.println(findMin(arr));
    }
}