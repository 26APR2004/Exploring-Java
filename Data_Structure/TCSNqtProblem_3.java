/*Airport security officials have confiscated several item of the passengers at 
 * the security check point. All the items have been dumped into a huge box (array).
 *  Each item possesses a certain amount of risk[0,1,2]. Here, the risk severity 
 *  of the items represent an array[] of N number of integer values. 
 *  The task here is to sort the items based on their levels of risk in the array.
 *   The risk values range from 0 to 2.

Example :

Input :

7  -> Value of N

[1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1], while input each element is separated by new line.

Output :

0 0 0 1 1 2 2  -> Element after sorting based on risk severity  */
package dataStructure;
import java.util.*;
public class TCSNqtProblem_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the analysed risks");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		// Display Input Array
//		System.out.println("Input Array :");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
		
//		#1 : 1st approch to sort
//		Arrays.sort(arr);
//      #2 : 2nd approach to sort
	    
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			if(arr[j]>arr[j+1])
			{  int temp=arr[j];
			    arr[j]=arr[j+1];
			    arr[j+1]=temp;}
			
		}

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
      sc.close();
	}

}
