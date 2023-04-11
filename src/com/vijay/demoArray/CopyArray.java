package com.vijay.demoArray;

import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args) {

		int size,i;
		System.out.println("enter the size of an array : ");
		Scanner sc= new Scanner(System.in);
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter elements of an array ");
	
		for( i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
			
		}
		for( i=0;i<size;i++)
		{
			System.out.println("["+i+"] = "+arr[i]);
			
		}
	
	}

}
