package com.vijay.demoArray;



public class Demo1 {

	public static void main(String[] args) {
		Integer i=10;
		System.out.println(i.getClass().getName());
		int[] number = new int[5];
		int value = 1;
		String[] name = {"vijay", "sandip","kunal","paree"};
		System.out.println(name[1]);
		name[1] = "mohit";
		System.out.println(name[1]);
//		for(int i=0;i<name.length;i++){
//			System.out.println(name[i]);
//		}
		int arrayLength = name.length;
		System.out.println(arrayLength);
		System.out.println("length of string array is -> "+name.length);
		System.out.println(name.getClass());
//		for(int i=0;i<number.length;i++){
//			number[i] = value;
//			System.out.println(value);
//			value++;
//		}
//		 for(String i : name) {
//		      System.out.println(i);
//		    }
	}
}
