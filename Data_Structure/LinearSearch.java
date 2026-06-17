//Problem Statement: Given an array, and an element num the task is to find if num is present in the given array or not. If present print the index of the element or print -1.
//arr[] = 1 2 3 4 5, num = 3  
//Output:
//2  `
//Explanation:
//3 is present at the 2nd index of the array.
package Array_DS;
import java.util.Scanner;
public class LinearSearch {

	public static int LinearSearch(int arr[],int num)
	{
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
				index=i;
		}
		return index;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the N value :");
	int N = sc.nextInt();
	int arr[]= new int[N];
	
	System.out.println("Enter the Array Elements :");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter the Searching Element:");
	int num= sc.nextInt();
		System.out.println("Serched Element Index is :"+LinearSearch(arr, num));
	sc.close();

	}

}
