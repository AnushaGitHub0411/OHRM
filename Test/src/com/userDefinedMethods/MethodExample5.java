package com.userDefinedMethods;

public class MethodExample5 {
 public void addition()
 {
	 int var1=20;
	 int var2=30;
	  int var3;
	 var3=var1+var2;
	 System.out.println("the value of the variable var3 after addition operation is:-"+var3);	 
 }
 private void subtraction()
 {
	 int var1=20;
	 int var2=30;
	  int var3;
	  var3=var1-var2;
	  System.out.println("the value of the variable var3 after subtraction operation is:-"+var3);
 }
 public static void main(String args[])
 {
	 MethodExample5 m5=new MethodExample5();
	 m5.addition();
	 m5.subtraction();
 }
}
