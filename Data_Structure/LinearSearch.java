// Linear Search 
package Data_Structure;
import java.util.Scanner;
public class LinearSearch {
	// T.C = O(N)
    public static int linearSearch(int arr[],int num)
    {
    	
    	for(int i=0;i<arr.length;i++)
    	{
    		 if(arr[i]==num)
    		 {
    			 return i;
    		 }
    			
    	}
    	
    	return -1;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
        System.out.println("Enter Elements : ");
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter the search elemnt :");
		int num =sc.nextInt();
        
        System.out.println("Index OF Array Element : "+linearSearch(arr,num));
	}

}
