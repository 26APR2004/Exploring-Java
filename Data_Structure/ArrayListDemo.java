// Collections FrameWork - List <---- ArrayList
package Data_Structure;
 import java.util.ArrayList;
 import java.util.Scanner;
 import java.util.Collections;
public class ArrayListDemo {

	public static void modifyArray(ArrayList<Integer> num,int n,int index)
	{
		 num.add(index,n);
	}
	
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		var num = new ArrayList<Integer>();  // Var Keyword to avod Writting data type agin
		// Add The Data in ArrayList
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		
//		System.out.println("Enter the Number Which You Want To Insert : ");
//		int n=sc.nextInt();
//		System.out.println("Enter the Index od data at which you want insert : ");
//		int index=sc.nextInt();
//		System.out.println(num);
		// Display Elements Of ArrayList By Using For Loop
		System.out.println("List Before Inserting extra data : ");
		for(Integer i : num)
		{
			System.out.println(i);
		}
		
//		modifyArray(num,n,index);
		num.set(0, 100);  // Set() Method
		num.remove(2);  // Remove() Method
		System.out.print("List After Inserting extra data : ");
		System.out.println(num);
		
//		num.clear();
		System.out.println(num.size()); // Return Size Of List
		
//      Sort ArrayList
		Collections.sort(num); // Sort The ArrayList
		
		System.out.println("ArrayList After Sorting : "+num);
		
	}

}
