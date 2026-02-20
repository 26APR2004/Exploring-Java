/*Given an integer array Arr of size N the task is to find the count
 *  of elements whose value is greater than all of its prior elements.
 * 

Note : 1st element of the array should be considered in the count of the result.

For example,

Arr[]={7,4,8,2,9}

As 7 is the first element, it will consider in the result.

8 and 9 are also the elements that are greater than all of its previous elements.

Since total of  3 elements is present in the array that meets the condition.

Hence the output = 3. */
package dataStructure;
import java.util.Scanner;
public class TCSNQTProblem_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value :");
		int N = sc.nextInt();
		int arr[]=new int[N];
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<arr.length;i++)
		{
			 arr[i]=sc.nextInt();
		}
		int max=arr[0],count=1;
		for(int i=1;i<arr.length;i++)
			
			{
				if(arr[i]>max)
				{	max=arr[i];
					count+=1;}
					
			}
		System.out.println(count);
	}

}
