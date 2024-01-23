package com.package1;

public class base {
	int varDefault =10;
	public int varPublic =20;
	private int varPrivate =30;
	protected int varProtected =40;
	void methodDefault()
	{
		System.out.println("Default variable" +varDefault);
		System.out.println("Default method");
		
	}

	void methodPublic()
	{
		System.out.println("public variable" +varPublic);
		System.out.println("public method");
		
	}


	void methodPrivate()
	{
		System.out.println("private variable" +varPrivate);
		System.out.println("private method");
		
	}
	void methodProtected()
	{
		System.out.println("protected variable" +varProtected);
		System.out.println("protected method");
		
	}

}
