/*
This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
*/
import java.util.*;
import static java.lang.System.out;

class Problem_2 {
        
    static int[] bruteForce(int[] arr) {
        int temp_arr[] = new int[arr.length];
        int curr_count = -1;
        for(int i = 0; i < arr.length; i++) {
            for(int k = 0; k < arr.length; k++) {
                if(i != k) {
                    if(curr_count == -1) {
                        curr_count = arr[k];
                    } else {
                        curr_count = curr_count * arr[k];
                    }
                }
            }
            temp_arr[i] = curr_count;
            curr_count = -1;
        }
        return temp_arr;
    }
    
    static int[] usingDivision(int[] arr) {
        int total_product = 1;
        int new_arr[] = new int[arr.length];
        
        // handles base case of when array if empty
        if(arr.length == 0) return new int[0];
        
        // get the product of all indexes
        for(int num : arr) {
            total_product = total_product * num;
        }
        
        /*
            For each index of the original array, 
            divide that from product num and 
            place at same index in new array
        */
        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = total_product / arr[i];
        }
        
        return new_arr;
    }
    
    static int[] withoutDivision(int[] arr) {
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        
        for(int i=0; i < arr.length; i++) {
            hashmap.put(i, arr[i]);
        }
//        hashmap.forEach((k,v) -> out.println("key: " + k + " value:" + v));
        for(int i=0; i < arr.length; i++) {
            hashmap.get(i);
        }
        return new int[arr.length];
    }
    
    public static void main(String[] args) {
        int arr1[] = new int[]{3, 2, 1};
        int arr2[] = new int[]{1, 2, 3, 4, 5};
        out.println("Brute Force Solutions: ");
        out.println(Arrays.toString(bruteForce(arr1)));
        out.println(Arrays.toString(bruteForce(arr2)));
        
        // use division
        out.println("\nUsing Division Solutions: ");
        out.println(Arrays.toString(usingDivision(arr1)));
        out.println(Arrays.toString(usingDivision(arr2)));
        
        // without division
        out.println("\nUsing No Division Solutions: ");
        out.println(Arrays.toString(withoutDivision(arr1)));
    }
}