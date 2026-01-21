package Data_Structure;
import java.util.Scanner;
public class RotateArrayKPlace {

	public static void rotateArray(int arr[],int k)
	{
		int temp[] = new int[k];
		for(int i=0;i<k;i++)
		{
			temp[i]=arr[i];
		}
        
		for(int i=k;i<arr.length;i++)
		{
			
		}
		
		System.out.println("Array After Rtotation : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(temp[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter K values : ");
		int k=sc.nextInt();
		
		System.out.println("Enter The Array Elements : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		rotateArray(arr,k);
	}

}
