//Problem Statement: You are given an array of integers, your task is to move all the zeros in the array to the end of the array and move non-negative integers to the front by maintaining their order.
//
//Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
//Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
//Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order
package Array_DS;
import java.util.Scanner;
public class ZerosAtEnd {

	public static int [] ZeroAtLast(int arr[],int N)
	{
		int new_arr[]=new int[N];
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				new_arr[index]=arr[i];
				index++;
			}

		}
		return new_arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N Vlaue:");
		int N =sc.nextInt();
		int arr[] = new int[N];
		System.out.println("Enter the Array Elements:");
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
        int new_arr[]=ZeroAtLast(arr, N);
        System.out.println("Array After Shiffted zero at Last :");
        for(int i:new_arr)
        {
        	 System.out.print(i+" ");
        }
	}

}
