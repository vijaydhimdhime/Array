package com.vijay.arrayMethods;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] num = {100,200,55,44};
		Arrays.sort(num);
		System.out.println(Arrays.binarySearch(num, 200));
		int number[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(">>>>>>>>>>");
		System.out.println("Index of element 4 is in : "+"index["+Arrays.binarySearch(number, 4)+"]");
		System.out.println("Index of element 4 is in : "+"index["+Arrays.binarySearch(number, 0, 5, 4)+"]");
		
	}
	

}
