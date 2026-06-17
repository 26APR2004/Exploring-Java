//Problem Statement: Given an array, we have to find the largest element in the array.
//Example 1:
//Input:
// arr[] = {2, 5, 1, 3, 0}  
//Output:
// 5  
//Explanation:
//  
//5 is the largest element in the array.
package Array_DS;

import java.util.Arrays;
import java.util.Scanner;
public class LargestElement {
	
	// Brute Force Approach
	public static int Largere(int arr[],int N)
	{
		Arrays.sort(arr);
		return arr[N-1];
	}
    // Optimal Approach
	public static int Largest(int arr[],int N)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<N;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value :");
		int N =sc.nextInt();
		
		int arr[] = new int[N];
		System.out.println("Enter the Array Elments :");
		for(int i=0;i<N;i++)
		{
			arr[i] = sc.nextInt();
		}
		int Largest_Number=Largest(arr, N);
		System.out.println("Largest Number in array :"+Largest_Number);
		sc.close();
//        System.out.println("Largest Element by Brute Approach :"+Largere(arr, Largest_Number));
	}

}
