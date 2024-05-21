package com.userDefinedMethods;

public class MethodExample2 {
	public void hello()
	{
		System.out.println("Testing");
	}
	public void chello()
	{
		System.out.println("Webdriver");
	}
	public static void main(String args[])
	{
		MethodExample2 m2=new MethodExample2();
		m2.hello();
		m2.chello();
		m2.pollo();
		System.out.println();
	}
public void pollo()
{
	System.out.println("Selenium");
}
}
