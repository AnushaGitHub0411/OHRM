package com.userDefinedMethods;

public class MethodExample7 {
	protected void multiplication()
	{
		int var1=10;
		int var2=30;
		int var3;
		var3=var1*var2;
		System.out.println("the value of the variable var3 after multiplication is:-"+var3);
		
	}
	public static void main(String args[]) {
		MethodExample7 m7=new MethodExample7();
		m7.multiplication();
		
		
	}
	
	

}
