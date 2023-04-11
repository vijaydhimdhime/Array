package com.vijay.demoArray;

import java.lang.reflect.Array;

public class DefaultValues {
	public static void main(String[] args) {
		boolean[] num = new boolean[2];
		for(int i=0;i<num.length;i++){
			System.out.println(num[i]);
		}
		String[] name = new String[2];
		for(int i=0;i<name.length;i++){
			System.out.println(name[i]);
		}
		
		char[] ch = new char[2];
		for(int i=0;i<ch.length;i++){
			System.out.println(ch[i]);
		}
		int[] a = new int[2];
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		float[] f = new float[2];
		for(int i=0;i<f.length;i++){
			System.out.println(f[i]);
		}
		double[] d = new double[2];
		for(int i=0;i<d.length;i++){
			System.out.println(d[i]);
		}
		byte[] b = new byte[2];
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		Array[] arr = new Array[3];
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		Object[] obj = new Object[5];
		for(int i=0;i<obj.length;i++){
			System.out.println(obj[i]);
		}
	}
	

}
