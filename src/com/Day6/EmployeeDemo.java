package com.Day6;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		
		// Create the first object of the class and pass the two arguments with type
		// string and int.
		
		System.out.println(Employee.CompanyName);
		Employee e=new Employee("Shubham",005);
		System.out.println(e);
		
		// Similarly, create the second object of the class and pass the two arguments.

		e=new Employee("Rahul",123);
		System.out.println(e);
		
		

	}

}
