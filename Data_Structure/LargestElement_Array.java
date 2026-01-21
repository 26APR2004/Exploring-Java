package Data_Structure;
import java.util.Scanner;
import java.util.Arrays;
public class LargestElement_Array {
	 // Brute Force To find largest Element From Array
	public static int bruteForce(int arr[], int n)
	{
	     Arrays.sort(arr);
	     for(int i=0;i<n;i++)
	     System.out.println(arr[i]);
		
	     return arr[n-1];
	}
	// Optimal Way To Find Largest Element From Array
	public static int optimal(int arr[],int n)
	{
		int largest=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]>largest)
				largest=arr[i];
		}
		return largest;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=5;
		int arr[]=new int[n];
		System.out.println("Enter the Array Element:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
//		//Display Array
//		for(int i=0;i<5;i++)
//		{
//			System.out.println(arr[i]);
//		}
     System.out.println("Largest Element : "+bruteForce(arr, n) );
     System.out.println("Largest Element : "+optimal(arr,n));
	}

}
