package com.vijay.demoArray;

import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array : ");
		int size = sc.nextInt();
		int[] number = new int[size];
		for(int i =0;i<size;i++){
			number[i] = sc.nextInt();
		}
		//System.out.println(size);
		for(int i=0;i<size;i++){
			System.out.print(number[i]);
		}
		
	}
}
