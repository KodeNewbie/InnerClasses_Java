package com.pack2;

public class ClassA 
{
	int x = 10;
	static int y = 20;
	
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
	
	static class InnerClassA //Nested Inner Class
	{
		void show()
		{
			System.out.println("Inner Class show method");
			System.out.println("Outer Class Instance Variable : "+ new ClassA().x);
			System.out.println("Outer Class static variable : "+ y);
		}
		static
		{
			System.out.println("Inner Class static block");
		}
		{
			System.out.println("Inner Class Instance block");
		}
		InnerClassA()
		{
			System.out.println("Inner Class constructor");
		}
		public static void main(String[] args) 
		{
			System.out.println("Inner Class main()");
			new InnerClassA().show();
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Outer class main()");
		
		ClassA.InnerClassA iobj = new ClassA.InnerClassA();
		iobj.show();
	}

}

