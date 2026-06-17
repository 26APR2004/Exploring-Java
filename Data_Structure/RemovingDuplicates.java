//Remove Duplicates in-place from Sorted Array
//Input: arr[]=[1,1,2,2,2,3,3]
//Output: [1,2,3,_,_,_,_]
//Explanation: Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.
package Array_DS;
import java.util.HashSet;
import java.util.Scanner;
public class RemovingDuplicates {

	public static void RemoveD(int arr[])
	{
		HashSet<Integer>se = new HashSet<Integer>();
		int index=0;
		for(int i : arr)
		{
			if(!se.contains(i))
			{
				se.add(i);
			    arr[index]=i;
			    index++;}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value :");
		int N = sc.nextInt();
		int arr[] = new int[N];
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		RemoveD(arr);
		for(int i:arr)
		{
			System.out.println(i);
		}
	}

}
