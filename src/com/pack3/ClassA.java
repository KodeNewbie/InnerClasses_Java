package com.pack3;

public class ClassA 
{
	void meth1()
	{
		String s = "Java";
		
		class InnerClassA //Method local Inner Class
		{
			void msg()
			{
				System.out.println(s.concat(" is awesome "));
			}
		}
		new InnerClassA().msg();
		
		class InnerClassB
		{
			String msg()
			{
				System.out.println("I am from InnerClassB");
				return "is amazing";
			}
		}
		System.out.println("Java ".concat(new InnerClassB().msg()));
	}
	
	public static void main(String[] args) 
	{
		new ClassA().meth1();
	}
}
