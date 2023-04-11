package com.vijay.arrayMethods;

import java.util.Arrays;

public class CopyOf {
	public static void main(String[] args) {
		int[] num = {10,20,30,40,50};
		int[] newArray = Arrays.copyOf(num, num.length);
		printNewArray(newArray);
		//System.out.println("copy of original array is : "+newArray);
	}

	public static void printNewArray(int[] newArray) {
System.out.println("newArray:");
for(int arr : newArray){
	System.out.print(arr);
System.out.print(" ");
}
System.out.println();
	}

}
