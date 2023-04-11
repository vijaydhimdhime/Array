package com.vijay.defaultValuesofAnArray;

import java.util.Scanner;

public class DefaultValuesOfAnArray {
	public static void main(String[] args) {
		System.out.println("integers default value : ");
		int []number = new int[3];
		for (int i = 0; i<number.length; i++){
			System.out.println("number["+i+"]"+" = "+number[i]);
		}
		System.out.println(">>>>>>>>>>>");
		boolean[] num = new boolean[3];
		System.out.println("booleans default value : ");
		for(int i=0;i<num.length;i++){
			System.out.println("boolean["+i+"]"+" = "+num[i]);
		}
		System.out.println("<<<<<<<<<<");
		System.out.println("strings default value : ");
		String[] str = new String[3];
		for(int i=0;i<str.length;i++){
			System.out.println("String["+i+"]"+" = "+str[i]);
			
			
		}
		String[] name = new String[2];
		name[0]= "vijay";
		name[1] = "kunal";
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name);
		char city[ ] = {'D','h','a','n','b','a','d'};
		  
		// Displaying elements of array of char type.
		     System.out.println("Name of city: " +city.length);
		     
		     Scanner sc = new Scanner(System.in);
		     int num1[ ] = new int[5]; // Creating an array object. 
		   
		  System.out.print("Enter " + num1.length + " integer values: ");
		  for (int i = 0; i < num1.length; i++)
			num1[i] = sc.nextInt();
		  
		// Calculating the sum of input values.
		    int sum = 0;
		    for(int i = 0; i< num1.length; i++){
		           sum += num1[i];	
		      }
			
		// Displaying sum of input values entered by user.
		     System.out.println("Sum: " +sum);
	}
	
	
	

}
