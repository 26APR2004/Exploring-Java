//Problem Statement: Find all factors of a number or find all distinct divisors of a natural number.
package dataStructure;
import java.util.ArrayList;
import java.util.Scanner;
public class TCSNQTPre_Fcat {
     public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 ArrayList<Integer> arr = new ArrayList<Integer>();
		 System.out.println("Enter the Number : ");
		 int N = sc.nextInt();
		 int factNumber;
		 for(int i=1;i<=N;i++)
		 {
			 if(N%i==0)
				 arr.add(i);
		 }
		 System.out.println(arr);
	}
}
