//Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.
//		Example 1:
//			Input: N = 5, array[] = {1,2,3,4,5}
//			Output: True.
//			Explanation: The given array is sorted i.e Every element in the array is smaller than or equals to its next values, So the answer is True.
package Array_DS;
import java.util.Scanner;
public class IsSortedArray {

	// Assending Order
	public static boolean IsArraySorted(int arr[],int N)
	{
		if(N==0)
		{
			return true;
		}
		else
		{
			for(int i=1;i<N;i++)
			{
				if(arr[i]<arr[i-1])
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N Number :");
		int N = sc.nextInt();
		int arr[] = new int[N];
		System.out.println("Enter the Element:");
		for(int i=0;i<N;i++)
		{
			arr[i]= sc.nextInt();
		}
		System.out.println(IsArraySorted(arr, N));
	}

}
