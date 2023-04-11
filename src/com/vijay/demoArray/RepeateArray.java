package com.vijay.demoArray;

public class RepeateArray {
	public static void main(String[] args) {
		char[] number = {'h','e','l','l','o'};
		for(int i =0;i<number.length;i++){
			System.out.print(number[i]+" ");
		}
		System.out.println("\n");
		//Arrays.sort(number);
		//System.out.println(Arrays.sort(number));
		for(int  i =0;i<number.length;i++){
			int count = 1;
			for(int j = i+1;j<number.length;j++){
				if(number[i] == number[j]){
					count++;
				}
				else
					break;
			}
			System.out.println(number[i]+" = "+count);
			//i+=(count-1);
			
		}
		
	}

}
