package com.vijay.arrayMethods;

import java.util.Arrays;

public class SortAnArrayFromTo {
	public static void main(String[] args) {
		int[] number = {0,1,5,2,3,6,4,7,8,9};
		Arrays.sort(number, 0, 5);
		System.out.println(Arrays.toString(number));
	}
}
