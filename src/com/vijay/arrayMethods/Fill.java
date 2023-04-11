package com.vijay.arrayMethods;

import java.util.Arrays;

public class Fill {
	public static void main(String[] args) {
		int[] num = {10,20,30,40,50};
		//int value = 60;
		Arrays.fill(num, 60);
		System.out.println(Arrays.toString(num));
	}
}
