package Data_Structure;
import java.util.Scanner;
public class CountMaxConsicitveOnes {
	// T.C = O(N)
	public static int CountConOnes(int arr[])
	{
		int count=0;
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1 )
				count++;
			else
				count=0;
		}
		max=Math.max(max, count);
		return max;
	}
  public static void main(String args[])
  {
	  Scanner sc =new Scanner(System.in);
	 int arr[] =new int[5];
	 System.out.println("Enter The Array Elements : ");
	 for(int i=0;i<arr.length;i++)
	 {
		 arr[i]=sc.nextInt();
	 }
	 System.out.println(CountConOnes(arr));
  }
  
}
