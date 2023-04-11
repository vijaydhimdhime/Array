package com.vijay.linearArray;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		int[] num = {1,4,5,0,7,10};
		System.out.println(Arrays.toString(num));
	//	System.out.println(num);
		Arrays.sort(num);
		for(int i=0;i<num.length;i++){
			System.out.println(num[i]);
		}
	
		
	
}

	

}
