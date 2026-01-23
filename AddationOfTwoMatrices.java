//Write java program to add two matrices of 2*3 matrix;
package com.company;

public class AddationOfTwoMatrices {
	public static void main(String[]args)
	{
		
    int Matrix_1[][]= {{2,3,4},{4,5,6}};
    int Matrix_2[][]={{4,3,4},{4,5,6}};
    int add[][]={{0,0,0},{0,0,0}};;
     for(int i=0;i<Matrix_1.length;i++)
     {
    	 for(int j=0;j<Matrix_1[i].length;j++) 
    	 {
    		  add[i][j]= Matrix_1[i][j]+Matrix_2[i][j];
    	 }
     }
     System.out.println("Addation of two matrices:");

     for(int i=0;i<Matrix_1.length;i++) // rows number time
     {
    	 for(int j=0;j<Matrix_1[i].length;j++) // columns number time
    	 {
    		 System.out.print(add[i][j]+" ");
    	 }
    	 System.out.println();
     }
    }}
