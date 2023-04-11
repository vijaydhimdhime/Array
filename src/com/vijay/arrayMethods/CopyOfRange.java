package com.vijay.arrayMethods;

import java.util.Arrays;

public class CopyOfRange {
	public static void main(String[] args) {
		int[] num = {10,20,30,40,50};
		int[] newArray = Arrays.copyOfRange(num, 0, num.length);
		
		printnewArray(newArray);
		
	}

	private static void printnewArray(int[] newArray) {
		System.out.println("copy range of array : ");
		for(int arr : newArray){
			System.out.println(arr);
			//System.out.println(" ");
		}
		//System.out.println();
	}
}
