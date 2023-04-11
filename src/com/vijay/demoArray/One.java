package com.vijay.demoArray;

public class One {
	
	void show(int x[]){
		for(int i=0;i<x.length;i++)
		System.out.println(x[i]);
		
	}
	
	public static void main(String[] args) {
		int[] x = {1,2,3,4,5};
		One o = new One();
		o.show(x);
		
	}

}
