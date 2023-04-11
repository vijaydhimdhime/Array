package com.vijay.linearArray;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int[] number = {10,30,70,20,100};
	//	Arrays.sort(number);
		System.out.println("sorting elements in asending order!!!");
		for(int i=0;i<number.length;i++){
			System.out.println("number["+i+"] = "+number[i]);
		}
		
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
