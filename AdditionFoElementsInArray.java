//create an array of 5 floats value and calculate their sum;
package com.company;

public class AdditionFoElementsInArray {
	public static void main(String[]args)
	{
	float arr[]= {1.2f,1.3f,1.4f,1.5f};
	float Add=0;
	for(float i:arr)
	{
		Add+=i;
	}
	System.out.println("Addition of the all the elements of the array :"+Add);
	
	}

}
