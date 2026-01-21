package Data_Structure;
import java.util.Scanner;
public class RotateArray {
 //  Better Aproach  T.C = O(N)
	public static void leftRotate(int arr[],int n)
	{
		int temp[] =new int[n];
		  for(int i=1; i<n ; i++)
		{
			temp[i-1] = arr[i];
		}
		  temp[n-1] = arr[0];
		 System.out.println("Array After Rotated Array : "); 
		 for(int i=0 ;i<n ; i++)
		 {
			 System.out.print(temp[i]+" ");
		 }
	}
	// Optimal Approach  	T.C = O(N)
	public static void LeftRotate(int arr[])
	{
	    int temp=arr[0];
	    
	    for(int i=1;i<arr.length;i++)
	    {
	    	arr[i-1]=arr[i];
	    }
	    arr[arr.length-1]=temp;
	    System.out.println("Array After The Left Rotate : ");
	    for(int i=0;i<arr.length;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int n=arr.length;
        System.out.println("Enter the array Element : ");
        for(int i=0 ; i<arr.length ; i++)
        {
        	arr[i]=sc.nextInt();
        }
//        leftRotate(arr,n);
        LeftRotate(arr);
	}

}
