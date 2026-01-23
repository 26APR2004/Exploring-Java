// Abstract class and Method
package com.company;

abstract class Remote
{
	abstract void turnOn();
	abstract void turnOff();
}

class TV extends Remote
{
	@Override
	void turnOn()
	{
		System.out.println("TV is Turn On");
	}
	
	void turnOff()
	{
		System.out.println("TV is Turn Off");
	}
}
public class AbstractClassToCalcilateArea {

	public static  void main(String[]args)
	{
		//Remote t=new Remote();  // Show erorr
		//TV t=new TV();
		Remote t=new TV();  // Dispatch
		t.turnOn();
		t.turnOff();
	}
}
