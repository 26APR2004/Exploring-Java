package Data_Structure;
import java.util.Scanner;
import java.util.Arrays;
public class SecondLargestElement_Array {

	// Brute Force Approach To Get Second Largest Element
	public static int bruteApproch(int arr[], int n)
	{
		Arrays.sort(arr);
		int secondL=-1;
		int largest=arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i] != largest)
			{	secondL = arr[i];
			break;
		}
		}
		return 	secondL;
	}
	// Better Approch To Get Second Largest Element
	public static int betterApproch(int arr[], int n)
	{
		// Largest Element Of Array
		Arrays.sort(arr);
		int largest=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]>largest)
				largest=arr[i];
		}
		
		// Second Largest Element Of Array
		int secondL=-1;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>secondL && arr[i]!=largest)
			{
				secondL=arr[i];
				
			}
		}
		return secondL;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Length Of Array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter The Array Elements : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
//		Display Array
//		System.out.print("Array: ");
//		for(int i=0;i<n;i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
//		
		System.out.println("Second Largest Element : "+bruteApproch(arr,n));
		System.out.println("Second Largest Element : "+betterApproch(arr,n));
	}

}
