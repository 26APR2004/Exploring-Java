//Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.
//Example 1:
//Input:
// [1, 2, 4, 7, 7, 5]  
//Output:
//  
//Second Smallest : 2  
//Second Largest : 5  
//Explanation:
//  The elements are sorted as 1, 2, 4, 5, 7, 7.  
//Hence, the second smallest element is 2, and the second largest element is 5.
package Array_DS;
import java.util.Scanner;
public class SecondLargest {

	
	public static int[] Sec_Min_Max(int arr[],int N)
	{
		int max=0,min=Integer.MAX_VALUE;
		int secMax=0,secMin=Integer.MAX_VALUE;
		
		for(int i=0;i<N;i++)
		{
			if(max<arr[i])
			{
				secMax=max;
				max=arr[i];
				
			}
			else if(secMax<arr[i])
				secMax=arr[i];
			
			if(min>arr[i])
			{
				secMin=min;
				min=arr[i];
			}
			else if(secMin>arr[i])
				secMin=arr[i];
		}
		
//		for(int i=0;i<N;i++)
//		{
//			if(secMax<arr[i] && max>arr[i])
//			{
//				secMax=arr[i];
//			}
//		}
		
		return new int[] {secMax,secMin};
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N Value :");
		int N = sc.nextInt();
		
		int arr[] = new int[N];
		System.out.println("Enter the array Elements :");
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int result[]=Sec_Min_Max(arr, N);
		
		System.out.println("Second Largest and Second Smallest Elments:");
		for(int i:result)
		{
			System.out.print(i+" ");
		}

		
	}

}
