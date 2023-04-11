package com.vijay.arrayMethods;

import java.util.Arrays;

public class FillFromToArray {
	public static void main(String[] args) {
		int[] num = {10,20,30,40,50,60,70,80,90};
		Arrays.fill(num, 0, 5, 100);
		System.out.println("ater filling an array :\n"+Arrays.toString(num));
	}

}
