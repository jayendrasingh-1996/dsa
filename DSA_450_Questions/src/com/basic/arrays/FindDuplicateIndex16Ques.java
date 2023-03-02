package com.basic.arrays;

import java.util.HashMap;

public class FindDuplicateIndex16Ques {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 4, 2, 2 };
		int res=findDuplicateUsingHashMap(arr);

		
	}

	
	
	// using the hash map approach
	public static int findDuplicateUsingHashMap(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (Integer x : nums) {

			if (map.containsKey(x)) {
				return x;

			} else {
				map.put(x, 1);
			}

		}

		return -1;
	}

}
