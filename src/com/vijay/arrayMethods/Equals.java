package com.vijay.arrayMethods;

import java.util.Arrays;

public class Equals {
	public static void main(String[] args) {
		//sequence of order is also must be same
		int[] array1 = {10,20,30,40,50};
		int[] array2 = {10,20,30,40,50};
		System.out.println(Arrays.equals(array1, array2));
		
		int[] array3 = {10,20,30,40,50};
		int[] array4 = {10,30,20,40,50};
		System.out.println(Arrays.equals(array3, array4));
	}

}
