/*A chocolate factory is packing chocolates into the packets. 
The chocolate packets here represent an array  of N number of integer values. 
The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).
Example 1 :

N=8 and arr = [4,5,0,1,9,0,5,0].

There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array

Input :

8  – Value of N

[4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by newline

Output:

4 5 1 9 5 0 0 0 */
package dataStructure;
import java.util.Scanner;
public class TcsNQTProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number chocolate you want insert:");
		int n=sc.nextInt();
		
		int arr[]= new int[n];
		System.out.println("Enter the chocolates:");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j]<arr[j+1])
				  { int temp = arr[j];
				      arr[j]=arr[j+1];
				      arr[j+1]=temp;}
			}
			  
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
