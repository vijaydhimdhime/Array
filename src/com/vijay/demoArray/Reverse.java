package com.vijay.demoArray;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
//		int arr[] = {10,20,30,40,50,60};
//		System.out.println("array size : "+arr.length);
//		for(int i=arr.length-1;i>=0;i--){
//			System.out.println("["+i+"] = "+arr[i]);
//		}
		
		int size,i;
		System.out.println("enter array size : ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int arr[] = new int[size];
		int copy[] = new int[size];
		for( i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("original array........");
		for(i=0;i<size;i++)
		{
			System.out.println("["+i+"] = "+arr[i]);
		}
		System.out.println("reverse array........");
		for( i=size-1;i>=0;i--){
			System.out.println("["+i+"] = "+arr[i]);
		}
		System.out.println("copy array........");
		for( i=0;i<size;i++)
		{
			copy[i] = arr[i];
			System.out.println("["+i+"] = "+copy[i]);
		}
		
	}

}
