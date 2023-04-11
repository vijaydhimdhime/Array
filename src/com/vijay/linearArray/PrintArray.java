package com.vijay.linearArray;

public class PrintArray {
	public static void main(String[] args) {
		/*
		int[] number = new int[2];
		number[0] = 10;
		number[1] = 15;
		System.out.println("number[0] = "+number[0]);
		System.out.println("number[1] = "+number[1]);
		*/
		
		/*
		int[] num = {10,20,30,40,50};
		for(int i=0;i<num.length;i++){
			System.out.println("num["+i+"] = "+num[i]);
		}
			
		*/
		
		String[] name = {"vijay","kunal","paree","sumedh","shrawasti"};
		for(int i = 0; i<name.length; i++){
			System.out.println("name["+i+"] = "+name[i]);
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");
		String[] name1 = {"vijay","kunal","paree","sumedh","shrawasti"};
		for(int i = name1.length-1; i>=0; i--){
			System.out.println("name["+i+"] = "+name1[i]);
		}
		
	System.out.println("<>><><><><><><><><><>");
	int number[] = {10,20,30,40,50};
	for(int i=0; i<number.length; i++){
		System.out.println("number["+i+"] = "+number[i]);
	}
	System.out.println("<>><><><><><><><><><>");
	for(int i=number.length-1; i>=0; i--){
		System.out.println("number["+i+"] = "+number[i]);
	}
		
	}
	
}
