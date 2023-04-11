package com.vijay.demoArray;

import java.util.Scanner;

public class SearchingElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int size = sc.nextInt();
		 int[] number = new int[size];
		 for(int i=0;i<number.length;i++){
			 number[i] = sc.nextInt();
		 }
		 System.out.println("enter the number u want to it :");
		 int x = sc.nextInt();
		 for(int i=0;i<number.length;i++){
			 if(number[i] == x)
			 System.out.println("The number " +x+" is inedx of "+i);
		 }
	}

}
