/*
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?
*/

import java.util.*;

class problem_1 {
	public static void main(String[] args) {
		//create an ArrayList
		int arr[] = new int[]{10, 15, 3, 7};
		int k = 17;
		boolean result1 = sumOf(arr, k);
		System.out.println("brute force: " + result1);
//		boolean result2 = sumOfBonus(arr, k);		
//		System.out.println("bonus: " + result2);
	}
	
	// brute force
	static boolean sumOf(int arr[], int k) {		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr.length; j++) {
				if(i != j) { // assuming we don't want to use same array values
					if(arr[i] + arr[j] == k){
						return true;
					}
				}
			}
		}
		return false;
	}
	
	static boolean sumOfBonus(int arr[], int k) {
		for(int i = 0; i < arr.length; i++) {
			int remainingSum = k-arr[i];
			System.out.println(remainingSum);
			if(remainingSum > 0 && Arrays.asList(arr).contains(remainingSum)) {
				return true;
			}
		}
		return false;
	}
}