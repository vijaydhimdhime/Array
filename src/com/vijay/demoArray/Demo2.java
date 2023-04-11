package com.vijay.demoArray;

public class Demo2 {
public static void main(String[] args) {
	String[] name = new String[5];
	name[0] = "vijay";
	name[1] = "sandip";
	name[2] = "kunal";
	name[3] = "sumedh";
	name[4] = "paree";
	System.out.println(name[0]);
	System.out.println(name[1]);
	System.out.println(name[2]);
	System.out.println(name[3]);
	System.out.println(name[4]);
	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	for(int i = 0;i<name.length;i++){
		System.out.println(name[i]);
	}
	
}
}
