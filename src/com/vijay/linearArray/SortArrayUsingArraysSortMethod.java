package com.vijay.linearArray;

import java.util.Arrays;

public class SortArrayUsingArraysSortMethod {
	public static void main(String[] args) {
		/*
		int number[] = {12,52,213,42,1,65};
		System.out.println(Arrays.toString(number));
		Arrays.sort(number);
		System.out.println(Arrays.toString(number));
//		for(int i =0;i<number.length;i++)
//		{
//			System.out.println("number["+i+"] = "+number[i]);
//			
//		}
		*/
		
		//user defind method
		int number[] = {12,52,213,42,1,65};
		System.out.println("Before sorting elements!!!!!");
		for(int i=0;i<number.length;i++){
			System.out.println("number["+i+"] = "+number[i]);
		}
		System.out.println("After the sorting elements!!!!!");
		sortArray(number,number.length);
		
		
	}

	private static void sortArray(int[] number, int length) {
		for(int i=0; i<number.length; i++)
		{
			for(int j=i+1; j<number.length; j++)
			{
				int temp=0;
				if(number[i]>number[j])
				{			
			    	 temp = number[i];
					number[i] = number[j];
					number[j] = temp;	
				}				
			}
			System.out.println(number[i]);
		}
	}
	
	

}
