package com.vijay.linearArray;

import java.util.Arrays;

public class AdditionOfArray {
	public static void main(String[] args) {
		int[] number = {10,20,30,40,50};
		String[ ] cities = {"Dhanbad", "New York", "Delhi", "London", "Ranchi" };
		int sum=0;
		for(int i=0; i<number.length;i++){
			sum = sum + number[i];
			
		}
		System.out.println("sumof array is : "+sum);
		//System.out.println(Arrays.toString(number));
		System.out.println(Arrays.asList(cities));
	}
	
}
