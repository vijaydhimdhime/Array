package com.vijay.arrayMethods;

import java.util.Arrays;

public class SortAnArray {
	
	public static void main(String[] args) {
		int[] num = {10,50,20,43,78,60,1};
		Arrays.sort(num);
		System.out.println("sorting an array :\n"+Arrays.toString(num));
	}
}
