/* Program Name: Abstract class and Method*/
/* Topic: Create Abstract class shape and extend circle and rectangle and print its area*/
package com.company;

abstract class Shape
{
	abstract double area();
}
class Circle_1 extends Shape
{
	int r;
	public Circle_1(int r)
	{
		this.r=r;
	}
	@Override
	
	 double area()
	{
		return Math.PI*Math.pow(r,2);
	}
}
class Rectangle_1 extends Shape
{
	int l,w;
	public Rectangle_1(int l,int w)
	{
		this.l=l;
		this.w=w;
	}
	 double area()
		{
			return l*w;
		}
}
public class AbstractShapeclass {
    public static void main(String[]args)
    {
    	Shape c=new Circle_1(12);
    	System.out.println("Area of Circle: "+c.area());
    	Shape r=new Rectangle_1(12,5);
    	System.out.println("Area od Rectangle: "+r.area());
    	
    }
}
