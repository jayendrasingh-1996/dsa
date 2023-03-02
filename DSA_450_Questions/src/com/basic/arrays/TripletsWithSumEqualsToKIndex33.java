package com.basic.arrays;

import java.util.Arrays;
import java.util.Collections;

public class TripletsWithSumEqualsToKIndex33 {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 45, 6, 10, 8 };

		int k = 14;

		boolean res = find3Numbers(arr,  arr.length,k);
		System.out.println(res);
	}

	
	// this is using 2 pointer methods
	public static boolean find3Numbers(int A[], int n, int X) {

		// Your code Here
		
		Arrays.sort(A);
		
		for(int i = 0 ; i < n ; i++) {
			
			int y = X -A[i];
			
			int low = i+1;
			int high = n-1;
			
			
			while(low < high) {
				
				if(A[low] + A[high] == y ) {
					return true;
				}else if( A[low] + A[high] >y ) {
					 high--;
				}else {
					low++;
				}
				
			}
			
		}
		
		
		return false;

	}

	
	// this is the brute force approach 
	public static boolean findTriplets(int[] arr, int x, int n) {

		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				for (int k = j + 1; k < n; k++) {

					if (arr[i] + arr[j] + arr[k] == x) {
						return true;

					}
				}
			}
		}

		return false;
	}
}
