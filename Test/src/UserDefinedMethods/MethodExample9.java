
package UserDefinedMethods;

public class MethodExample9
{

int var1=50;
int var2=10;

public void addition() 
{

int var1=20;
int var2=30;
int var3;

var3=var1+var2;
System.out.println(" The value of the Variable var3 after Addition Operation is :- "+var3);
}

public void addition(int var1,int var2) 
{

int var3;

var3=var1+var2;
System.out.println(" The value of the Variable var3 after Addition Operation is :- "+var3);
}

public void subtraction()
{
int var3;
   var3=var1-var2; 
System.out.println(" The value of the Variable var3 after Subtraction Operation is :- "+var3);
}


public static void main(String[] args) {

MethodExample9 m9 = new MethodExample9();
m9.addition();
m9.subtraction();
System.out.println();

m9.addition(100, 70);


}

}