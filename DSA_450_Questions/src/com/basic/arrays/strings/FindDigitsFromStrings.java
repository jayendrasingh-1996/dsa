package com.basic.arrays.strings;

public class FindDigitsFromStrings {

	static int MAX=10;
	public static void main(String[] args) {
		
		String str="90ab1";
		
		
		boolean result = checkIfAllDigitsFrom0to9IsPresent(str,str.length());
		
	}
	
	public static boolean  checkIfAllDigitsFrom0to9IsPresent(String str , int len) {
		
		boolean[] isPresent = new boolean[MAX];
		
		for(int i =0 ;i < len ;i++) {
			
			if(checkIfDigit(str.charAt(i))) {
				
				isPresent[str.charAt(i)-'0'] = true;
			}
		}
		
		for(int i = 0 ; i < MAX ; i++) {
			
			if(!isPresent[i]) {
				return false;
			}
		}
		
		return true;
		
	}
	
	public static boolean checkIfDigit(char ch) {
		
		if(ch >= '0' && ch <='9')
		{
			return true;
		}
		return false;
	}
}
