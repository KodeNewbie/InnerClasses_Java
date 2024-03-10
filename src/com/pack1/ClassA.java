package com.pack1;

public class ClassA 
{
	private void meth1()
	{
		System.out.println("Outer Class method");
	}
	static
	{
		System.out.println("Outer Class static block");
	}
	{	
		System.out.println("Outer Class instane block");
	}
	ClassA()
	{	
		System.out.println("Outer Class constructor");
	}
	
	class InnerClassA //Nested Inner Class
	{
		void show()
		{
			System.out.println("Inner Class method");
			meth1();
		}
		{
			System.out.println("Inner Class Instance block");
		}
		InnerClassA()
		{
			System.out.println("Inner Class constructor");
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Outer class main()");
		
		ClassA.InnerClassA iobj = new ClassA().new InnerClassA();
		iobj.show();
	}

}
