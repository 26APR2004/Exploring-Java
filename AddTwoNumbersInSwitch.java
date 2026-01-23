package com.company;

public class AddTwoNumbersInSwitch {
	public static void main(String[]args)
	{
		final int a=10;
		final int b=5;
		
		switch(a+b)
		{
		case 15:
			System.out.println("Result is 15");
			break;
		case 20:
			System.out.println("Result is 20");
			break;
			default:
				System.out.println("No Match Found!");
				break;
		}
	}

}
