package com.Day6;

public class Employee {
	
	//Declare instance variables.
	
	private String Name;
	private int id;
	
	//Declare a static variable companyName with data type String and assign value
	//SGI which is common for all the objects.
	
	static String CompanyName="SGI";


	//Declare a two-parameter constructor with parameters named n and i.

	
	Employee(String name, int id) {
		
		this.Name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", id=" + id + "]";
	}

	

	

	
	
	

}
