package com.vijay.demoArray;

public class Student {
	String name;
	int rollNo;

	Student(String name, int rollNo) 
	{
		this.name = name;
		this.rollNo = rollNo;
	}
	public static void main(String[] args) 
	{
	// Create a String array with three Student objects.	
	  Student[ ] st = { new Student("Deep", 01), 
			  			new Student("John", 02), 
			  			new Student("Herry", 03)
	  				  };
	// Accessing elements of the specified array.
	for(int i = 0; i < st.length; i++)
	{
	    System.out.println("Name: " +st[i].name+ ", "+"Roll no: " +st[i].rollNo);	
	  }
	 }

}
