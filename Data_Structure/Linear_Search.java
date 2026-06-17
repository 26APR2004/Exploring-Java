package Array_DS;
import java.util.Scanner;
public class Linear_Search {
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
		System.out.println("Enter the N Vlaue :");
		int N = sc.nextInt();
		
		int arr[]=new int[N];
		System.out.println("Enter the Array Elements :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the search element:");
		int num=sc.nextInt();
		
		System.out.println("Index of search elemnt:"+LinearSearch(arr, num));
        sc.close();
	}

}
