package com.userDefinedMethods;

public class MethodExample8 {
	protected void division()
	{
		int var1=20;
		int var2=5;
		int var3;
		var3=var1/var2;
		System.out.println("the value of the variable var3 after division operation is:-"+var3);
	}
	public static void main(String args[])
	{
		MethodExample8 m8=new MethodExample8();
		m8.division();
	}

}
