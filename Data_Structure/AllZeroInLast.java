//  Given an array of integers, rotating array of elements by k elements either left or right.
package Data_Structure;
import java.util.Scanner;
public class AllZeroInLast {
 // T.C = O(N)
	public static void zeroAtLast(int arr[])
	{
		int temp[]=new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
				{temp[index]=arr[i];
			    index++;}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=temp[i];
		}
		System.out.println("Array After Rearrange : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter The Array Elements : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		zeroAtLast(arr);
	}

}
