package com.vijay.demoArray;

public class Addition {
	
	void sum(int x[]){
		//System.out.println("array : x = "+x.clone());
		int sum =0;
		for(int i=0;i<x.length;i++)
		{
			sum +=x[i] ;
			
		}
		System.out.println("addition of array is : sum = "+sum);
		
	}
	void multiplication(int x[]){
		int result=1;
		for(int i=0; i<x.length; i++){
			result = result*x[i];
		}
		System.out.println("multiplication of an array is : "+result);
	}
	void disp(int[] x){
		System.out.println("welcome to java programming.....");
	}
	public static void main(String[] args) {
		int[] x = {10,10};
		Addition o = new Addition();
		o.sum(x);
		o.multiplication(x);
		o.disp(x);
		
	}

}
