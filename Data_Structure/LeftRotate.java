//Problem Statement: Given an integer array nums, rotate the array to the left by one.
//Example 1:
//Input:
// nums = [1, 2, 3, 4, 5]  
//Output:
// [2, 3, 4, 5, 1]  
//Explanation:
// Initially, nums = [1, 2, 3, 4, 5]  
//Rotating once to the left results in nums = [2, 3, 4, 5, 1]
package Array_DS;
import java.util.Scanner;
public class LeftRotate {

	public static int[] RotateRight(int arr[],int N)
	{
		int temp[] = new int[N];
		temp[0]=arr[N-1];
		for(int i=0;i<N-1;i++)
		{
			temp[i+1]=arr[i];
		}
		
		return temp;
	}
	public static int[] RotateLeft(int arr[],int N)
	{
		int temp[] = new int[N];
		for(int i=1;i<N;i++)
		{
			temp[i-1]=arr[i];
		}
		temp[N-1]=arr[0];
		return temp;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value :");
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int result_1[]=RotateLeft(arr, N);
		System.out.println("Array After Left Roation :");
		for(int i=0;i<result_1.length;i++)
		{
		   System.out.print(result_1[i]+" ");
		}
		System.out.println();
		int result_2[]=RotateRight(arr, N);
		System.out.println("Array After Right Roation :");
		for(int i=0;i<result_2.length;i++)
		{
		   System.out.print(result_2[i]+" ");
		}

	}

}
